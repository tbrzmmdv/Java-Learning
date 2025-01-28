package MentorLesson15;

import java.util.concurrent.locks.ReentrantLock;

public class LockTask {

    private final ReentrantLock inventoryLock= new ReentrantLock();
    private final ReentrantLock shippingLock= new ReentrantLock();


    public synchronized void processOrder() {
        if (inventoryLock.tryLock()) {


            try {
                if (shippingLock.tryLock()) {
                    try {
                        System.out.println("Succesfully");
                    } finally {
                        shippingLock.unlock();
                    }
                } else {
                    System.out.println("Unsuccessfully");
                }

            } finally {
                inventoryLock.unlock();
            }
        }
        else {
            System.out.println("Unsuccesful");
        }
    }

    public static void main(String[] args) {
        LockTask lockTask=new LockTask();
        Thread thread1=new Thread(lockTask::processOrder);
        Thread thread2=new Thread(lockTask::processOrder);
        Thread thread3=new Thread(lockTask::processOrder);
        Thread thread4=new Thread(lockTask::processOrder);
        Thread thread5=new Thread(lockTask::processOrder);
        Thread thread6=new Thread(lockTask::processOrder);


        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
        thread5.start();
        thread6.start();






    }

}


