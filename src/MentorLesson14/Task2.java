package MentorLesson14;

import java.lang.reflect.Executable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

public class Task2 {
    public static void main(String[] args) {
        ExecutorService executor= Executors.newFixedThreadPool(12);

        check(executor);
    }


    public static void check(ExecutorService executor){
        for (int i=0;i<8;i++){
            final int id=i;
            executor.execute(()->{
                System.out.println("Task "+ id+" is being executed by "+Thread.currentThread().getName());
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            });
        }
        executor.shutdown();
    }



}
