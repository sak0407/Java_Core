import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

class ResourceQueue{
    BlockingQueue<Integer> que=new ArrayBlockingQueue<>(1);  //As it is single producer and single consumer
    public void produce(int value) throws InterruptedException{
        que.put(value);
    }
    public int consume() throws InterruptedException{
        return que.take();
    }
}

class Producer implements Runnable{

    ResourceQueue rq;

    public Producer(ResourceQueue rq){
        this.rq=rq;
    }

    @Override
    public void run() {
        try {
            for (int i = 0; i < 20; i++) {
                rq.produce(i);
                System.out.println("Produced "+i);
                Thread.sleep(100);
            }
        }catch (InterruptedException ex){
            Thread.currentThread().interrupt();
        }

    }
}

class Consumer implements Runnable{
    ResourceQueue rq;
    public Consumer(ResourceQueue rq){
        this.rq=rq;
    }
    @Override
    public void run() {
       try{

           for(int i=0;i<20;i++){
               int value=rq.consume();
               System.out.println("Consumed "+value);
               Thread.sleep(150);
           }

       }catch (InterruptedException ex){
           Thread.currentThread().interrupt();
       }
    }
}


public class ProducerConsumerQue {
    public static void main(String[] args) {

        ResourceQueue rq=new ResourceQueue();

        Thread producerThread=new Thread(new Producer(rq));
        Thread consumerThread=new Thread(new Consumer(rq));

        producerThread.start();
        consumerThread.start();
        try{
            producerThread.join();
            consumerThread.join();

        }catch (InterruptedException ex){
            Thread.currentThread().interrupt();
        }


    }


}
