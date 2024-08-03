
class EvenOdd {
    int counter = 1;
    static int N = 100;

    public void printOdd() {
        synchronized (this) {
            while (counter < N) {
                if (counter % 2 == 0) {
                    try {
                        wait();
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                    }
                }
                System.out.println("Odd " + counter);
                counter++;
                notify();
            }
        }
    }

    public void printEven() {

        synchronized (this) {
            while (counter < N) {
                if (counter % 2 == 1) {
                    try{
                        wait();
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                    }
                }

                System.out.println("Even " + counter);
                counter++;
                notify();
            }
        }

    }
}

public class PrintEvenOdd {
    public static void main(String[] args) {
        EvenOdd e =new EvenOdd();
        Thread th1 = new Thread( ()-> e.printEven());
        Thread th2 = new Thread( ()-> e.printOdd());
        th1.start(); th2.start();

    }

}
