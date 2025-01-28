package Lesson19;

public class Countdown implements Runnable {
    private String threadName;

    public Countdown(String threadName) {
        this.threadName = threadName;
    }

    @Override
    public void run() {
        for (int i = 5; i >= 1; i--) {
            System.out.println(threadName + " - Countdown: " + i);

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

        }
    }

    public static void main(String[] args) {
        Countdown thread1 = new Countdown("Thread 1");
        Countdown thread2 = new Countdown("Thread 2");

        Thread t1 = new Thread(thread1);
        Thread t2 = new Thread(thread2);

        t1.start();
        t2.start();
    }
}

