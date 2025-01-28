package MentorLesson12;

public class MyThread extends Thread {

    static class OrderDataFetcher extends Thread {

        @Override
        public void run() {
            System.out.println("Order data fetcher");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Order data fetched");
        }
    }

    static class PaymentDataFetcher extends Thread {


        @Override
        public void run() {
            System.out.println("Payment data fetcher");
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Payment data fetched");
        }
    }

    public static void main(String[] args) throws InterruptedException {

        Thread orderDataFetcher=new Thread(new OrderDataFetcher());
        Thread paymentDataFetcher=new Thread(new PaymentDataFetcher());


        paymentDataFetcher.setDaemon(true);

        orderDataFetcher.start();
        paymentDataFetcher.start();
        orderDataFetcher.join();
        paymentDataFetcher.join();

        System.out.println("Main thread is finishing.");

    }



}







