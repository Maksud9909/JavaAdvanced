package Multithreading.SynchcronizedBlock;

public class Sychcronized {
    public static void main(String[] args) {
        MyRunnableImpl2 myRunnable1 = new MyRunnableImpl2();
        Thread thread6 = new Thread(myRunnable1);
        Thread thread7 = new Thread(myRunnable1);
        Thread thread8 = new Thread(myRunnable1);
        thread6.start();
        thread7.start();
        thread8.start();
    }
}



class Counter2 {
    static int count  = 0;
}


class MyRunnableImpl2 implements Runnable {
    public void doWork2 (){
        System.out.println("Wassup niggas");
    }
    public void doWork1 (){
        doWork2();
        synchronized(this) {
            Counter2.count++;
            System.out.println(Counter2.count);
        }
    }

    @Override
    public void run() {
        for (int i = 0; i < 3; i++) {
            doWork1();
        }
    }
}


