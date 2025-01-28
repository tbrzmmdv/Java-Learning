package MentorLesson13;

public class ThreadThread extends Thread{

    static class DataLoader extends Thread{
        @Override
        public void run() {
            System.out.println("Data Loading...");
            try {
                Thread.sleep(4000);
                System.out.println("Data Loaded...");
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
    static class CacheUpdater extends Thread{
        @Override
        public void run() {
            System.out.println("Cache Upddating...");
            try {
                Thread.sleep(2000);
                System.out.println("Cache Updated...");
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

    static class LogWriter extends Thread{
        @Override
        public void run() {
            System.out.println("Writing...");
            try {
                Thread.sleep(1000);
                System.out.println("Writed...");
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public static void main(String[] args) throws InterruptedException {
        Thread dataLoader=new Thread(new DataLoader());
        Thread cacheUpdater=new Thread(new CacheUpdater());
        Thread logWriter=new Thread(new LogWriter());

        cacheUpdater.setDaemon(true);
        dataLoader.start();
        cacheUpdater.start();
        logWriter.start();

         dataLoader.join();
         cacheUpdater.join();
         logWriter.join();

        System.out.println("Main thread is finishing.");
    }
}
