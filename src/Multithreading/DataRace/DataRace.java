package Multithreading.DataRace;

public class DataRace {
    public static void main(String[] args) {
        MyRunnableImpl myRunnable = new MyRunnableImpl();
        Thread thread1 = new Thread(myRunnable);
        Thread thread2 = new Thread(myRunnable);
        Thread thread3 = new Thread(myRunnable);
        thread1.start();
        thread3.start();
        thread2.start();
    }
}


class Counter {
    static int count  = 0;
}


class MyRunnableImpl implements Runnable {
    public synchronized void increment (){
        Counter.count++;
        System.out.print(Counter.count + " ");
    }

    @Override
    public void run() {
        for (int i = 0; i < 3; i++) {
            increment();
        }
    }
}
