package Multithreading.Volatile;

public class Volatile extends Thread {

    volatile boolean aBoolean = true;
    @Override
    public void run() {
        long counter = 0;
        while (aBoolean){
            counter++;
        }
        System.out.println("Loop is finished counter " + counter);
    }

    public static void main(String[] args) throws InterruptedException {
        Volatile thread1 = new Volatile();
        thread1.start();
        Thread.sleep(3000);
        System.out.println("After 3 seconds it is time to wake up ");
        thread1.aBoolean = false;
        thread1.join();
        System.out.println("End of code");
    }
}
