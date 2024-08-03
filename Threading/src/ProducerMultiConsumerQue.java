import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

class ResourceQueuMulti{

    private static final int stop=-1;
    BlockingQueue<Integer> que=new ArrayBlockingQueue<>(10);  //As it is single producer and single consumer
    public void produce(int value) throws InterruptedException{
        que.put(value);
    }
    public int consume() throws InterruptedException{
        return que.take();
    }

    // Gracefull terminatin

    public static int getKill(){
        return stop;
    }
}

class ProducerMulti implements Runnable{
    ResourceQueuMulti rq;
    public ProducerMulti(ResourceQueuMulti rq){
        this.rq=rq;
    }

    @Override
    public void run() {
        try {

            for(int i=0;i<20;i++){
                rq.produce(i);
                System.out.println("Produced "+i);
                Thread.sleep(100);
            }
            // Send a termination signal for each consumer
            for (int j = 0; j < 3; j++) {
                rq.produce(ResourceQueuMulti.getKill());
            }
        }catch (InterruptedException ex){
            Thread.currentThread().interrupt();
        }

    }
}

class ConsumerMulti implements Runnable{
    ResourceQueuMulti rq;
    public ConsumerMulti(ResourceQueuMulti rq){
        this.rq=rq;
    }
    @Override
    public void run() {
       try{
           while(true) {// continuously consume items
               int value = rq.consume();

               if(value == ResourceQueuMulti.getKill()){
                   System.out.println(Thread.currentThread().getName() + " received shutdown signal.");
                   break;
               }
               System.out.println(Thread.currentThread().getName() + " Consumed: " + value);
               Thread.sleep(150); // simulate time taken to consume
           }



       }catch (InterruptedException ex){
           Thread.currentThread().interrupt();
       }
    }
}


public class ProducerMultiConsumerQue {
    public static void main(String[] args) {

        ResourceQueuMulti rq=new ResourceQueuMulti();

        Thread producerThread=new Thread(new ProducerMulti(rq));
        Thread consumerThread1 =new Thread(new ConsumerMulti(rq), "Consumer-1");
        Thread consumerThread2 =new Thread(new ConsumerMulti(rq), "Consumer-2");
        Thread consumerThread3 =new Thread(new ConsumerMulti(rq), "Consumer-3");

        producerThread.start();
        consumerThread1.start();
        consumerThread2.start();
        consumerThread3.start();

        try{
            producerThread.join();
            consumerThread1.join();
            consumerThread2.join();
            consumerThread3.join();

        }catch (InterruptedException ex){
            Thread.currentThread().interrupt();
        }


    }
}
