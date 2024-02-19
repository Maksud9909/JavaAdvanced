package Multithreading.ThreadMethods;

public class Ex6 {
    public static void main(String[] args) {
        System.out.println("Main started");
        MyThread5 myThread5 = new MyThread5();
        Thread thread = new Thread(new MyThreadRunnable());
        thread.setName("Anton");
        thread.setPriority(1);
        thread.start();


        myThread5.setName("Maksud");
        myThread5.setPriority(10);
        myThread5.start();
    }
}

class MyThread5 extends Thread{

    @Override
    public void run() {
        for (int i = 0; i < 15; i++) {
            System.out.println("Hello world");
        }
    }
}

class MyThreadRunnable implements Runnable{

    @Override
    public void run() {
        for (int i = 0; i < 15; i++) {
            System.out.println("Bye world");
        }
    }
}