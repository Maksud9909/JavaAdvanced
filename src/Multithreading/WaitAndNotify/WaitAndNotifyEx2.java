package Multithreading.WaitAndNotify;

public class WaitAndNotifyEx2 {
    public static int counter = 0;

    public static void main(String[] args) {
        Thread thread1 = new Thread(new Increment());
        Thread thread2 = new Thread(new Continue());
        thread1.start();
        thread2.start();
    }
}


class Increment implements Runnable{

    @Override
    public synchronized void run() {
        for (int i = 0; i < 10; i++) {
            WaitAndNotifyEx2.counter++;
            System.out.println(WaitAndNotifyEx2.counter);
        }
        try {
            wait();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}

class Continue implements Runnable{
    @Override
    public synchronized void run() {
        notify();
        System.out.println("I got " + WaitAndNotifyEx2.counter + " number");
    }
}
