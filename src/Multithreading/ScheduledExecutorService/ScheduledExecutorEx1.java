package Multithreading.ScheduledExecutorService;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class ScheduledExecutorEx1 {
    public static void main(String[] args) throws InterruptedException {
        ScheduledExecutorService scheduledExecutorService = Executors.newScheduledThreadPool(1);
//        for (int i = 0; i < 10; i++) {
//            scheduledExecutorService.execute(new RunnableImpl());
//        }

//        scheduledExecutorService.schedule(new RunnableImpl(),3, TimeUnit.SECONDS);
//        scheduledExecutorService.shutdown();


//        scheduledExecutorService.scheduleAtFixedRate(new RunnableImpl(),3,1,TimeUnit.SECONDS);
//        Thread.sleep(10000);
//        scheduledExecutorService.shutdown();

        scheduledExecutorService.scheduleWithFixedDelay(new RunnableImpl(),3,1,TimeUnit.SECONDS);
        Thread.sleep(10000);
        scheduledExecutorService.shutdown();




    }
}
class RunnableImpl implements Runnable{
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + "starts work");
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(Thread.currentThread().getName() + "ends work");
    }
}