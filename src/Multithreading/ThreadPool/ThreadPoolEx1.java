package Multithreading.ThreadPool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class ThreadPoolEx1 {
    public static void main(String[] args) throws InterruptedException {
        ExecutorService executor = Executors.newCachedThreadPool();
        for (int i = 0; i < 10; i++) {
            executor.execute(new RunnableImpl());
        }


        executor.shutdown(); // задач больше не будет и можно выключать
        executor.awaitTermination(1, TimeUnit.MICROSECONDS);
        System.out.println("Main ends");
    }
}


class RunnableImpl implements Runnable{


    @Override
    public void run() {

            System.out.println(Thread.currentThread().getName());
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

    }
}