package MentorLesson14;

public class Parking {
    public int avaliableParkingPlaces=5;

    public synchronized void bookParking(){
        while (avaliableParkingPlaces==0){

            try {
                System.out.println(Thread.currentThread().getName()+" is waiting for booking parking place");
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

        avaliableParkingPlaces--;
        System.out.println(Thread.currentThread().getName()+" booked a parking place.Parking place left:"+avaliableParkingPlaces);
    }

    public synchronized void replaceParkingPlaces(){
        avaliableParkingPlaces=7;
        System.out.println("Parking places replaced");
        notifyAll();
    }


    public static void main(String[] args) throws InterruptedException {
        Parking parking=new Parking();


        Thread parkingCustomer1=new Thread(parking::bookParking,"Customer 1");
        Thread parkingCustomer2=new Thread(parking::bookParking,"Customer 2");
        Thread parkingCustomer3=new Thread(parking::bookParking,"Customer 3");
        Thread parkingCustomer4=new Thread(parking::bookParking,"Customer 4");
        Thread parkingCustomer5=new Thread(parking::bookParking,"Customer 5");
        Thread parkingCustomer6=new Thread(parking::bookParking,"Customer 6");
        Thread parkingCustomer7=new Thread(parking::bookParking,"Customer 7");
        Thread parkingCustomer8=new Thread(parking::bookParking,"Customer 8");
        Thread parkingCustomer9=new Thread(parking::bookParking,"Customer 9");


        parkingCustomer1.start();
        parkingCustomer2.start();
        parkingCustomer3.start();
        parkingCustomer4.start();
        parkingCustomer5.start();
        parkingCustomer6.start();
        parkingCustomer7.start();
        parkingCustomer8.start();
        parkingCustomer9.start();


        Thread parkingAgent=new Thread(()->{
            try {
                Thread.sleep(1000);
                parking.replaceParkingPlaces();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });

        parkingAgent.start();
        parkingCustomer1.join();
        parkingCustomer2.join();
        parkingCustomer3.join();
        parkingCustomer4.join();
        parkingCustomer5.join();
        parkingCustomer6.join();
        parkingCustomer7.join();
        parkingCustomer8.join();
        parkingCustomer9.join();



    }





}
