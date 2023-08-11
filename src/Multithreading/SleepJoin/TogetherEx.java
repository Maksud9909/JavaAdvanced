package Multithreading.SleepJoin;

public class TogetherEx {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Methods main started");
        Worker worker = new Worker();
        System.out.println(worker.getState());
        worker.start();
        System.out.println(worker.getState());
        worker.join();
        System.out.println(worker.getState());
        System.out.println("Methd main ends ");
    }
}


class Worker extends Thread {
    @Override
    public void run() {
        System.out.println("Work Begins");
        try {
            Thread.sleep(2500);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Work ends");
    }
}