package MentorLesson15;

public class WaterDispenser {
    int waterCapacity=20;

    public synchronized void dispenseWater(int litres) {
        if (waterCapacity<litres){
            System.out.println(Thread.currentThread().getName()+" is waiting for dispense water");
            try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

        waterCapacity=waterCapacity-litres;
        System.out.println(Thread.currentThread().getName()+" dispense water.Avaliable water "+waterCapacity);


    }

    public synchronized void replaceWaterCapacity(){
        waterCapacity=20;
        System.out.println("Water Capacity replaced");
        notifyAll();
    }

    public static void main(String[] args) throws InterruptedException {


        WaterDispenser waterDispenser=new WaterDispenser();

        Thread customer1 = new Thread(() -> waterDispenser.dispenseWater(15), "Customer 1");
        Thread customer2 = new Thread(() -> waterDispenser.dispenseWater(7), "Customer 2");
        Thread customer3 = new Thread(() -> waterDispenser.dispenseWater(2), "Customer 3");
        Thread customer4 = new Thread(() -> waterDispenser.dispenseWater(4), "Customer 4");
        customer1.start();
        customer2.start();
        customer3.start();
        customer4.start();


        Thread waterAgency=new Thread(()->{
            try {
                Thread.sleep(2000);
                waterDispenser.replaceWaterCapacity();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });

        waterAgency.start();
        waterAgency.join();
        customer1.join();
        customer2.join();
        customer3.join();
        customer4.join();

    }
    
}
