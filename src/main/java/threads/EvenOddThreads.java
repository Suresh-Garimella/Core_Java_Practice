package threads;

public class EvenOddThreads extends Thread {
    public int i;
    public String threadName;

    public EvenOddThreads(String threadName, int startingNumber) {
        this.threadName = threadName;
        this.i = startingNumber;
    }

    public void run() {
        long startTime = System.currentTimeMillis();
        while (i <= 60) {
            System.out.println(threadName + ": is running..." + i);
            i += 2;
            try {

                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        EvenOddThreads t1 = new EvenOddThreads("Even Thread", 2); // Starting from 2 for even numbers
        t1.start();
        EvenOddThreads t2 = new EvenOddThreads("Odd Thread", 1); // Starting from 1 for odd numbers
        t2.start();
    }
}

