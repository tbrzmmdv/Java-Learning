package Lesson19;

public class Threadss implements Runnable {
    @Override
    public void run() {

            for (int i = 0; i < 3; i++) {
                System.out.println("Hello from MyThread");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
    }

    public static void main(String[] args) {
        Threadss newThread = new Threadss();
        Thread thread = new Thread(newThread);
        thread.start();
    }
}
