package Multithreading.SleepJoin;

public class MyRunnable extends Thread {
    @Override
    public void run() {
        for (int i = 1; i < 10; i++) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println(Thread.currentThread().getName() + " " + i);
        }

    }
    
    public static void main(String[] args) throws InterruptedException {
        Thread thread1 = new Thread(new Ex1());
        MyRunnable thread2 = new MyRunnable();
        thread1.start();
        thread2.start();
        thread1.join();



        System.out.println("The end");
    }


}

class Ex1 implements Runnable{
    @Override
    public void run() {
        for (int i = 1; i < 10; i++) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println(Thread.currentThread().getName() + " " + i);
        }

    }
}