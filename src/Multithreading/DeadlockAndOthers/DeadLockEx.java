package Multithreading.DeadlockAndOthers;

public class DeadLockEx {
    private final Object lock1 = new Object();
    private final Object lock2 = new Object();

    public void method1() {
        synchronized (lock1) {
            System.out.println("Thread 1 acquired lock1");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            synchronized (lock2) {
                System.out.println("Thread 1 acquired lock2");
            }
        }
    }

    public void method2() {
        synchronized (lock1) {
            System.out.println("Thread 2 acquired lock2");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            synchronized (lock2) {
                System.out.println("Thread 2 acquired lock1");
            }
        }
    }

    public static void main(String[] args) {
        DeadLockEx deadlockExample = new DeadLockEx();

        Thread thread1 = new Thread(() -> deadlockExample.method1());
        Thread thread2 = new Thread(() -> deadlockExample.method2());

        thread1.start();
        thread2.start();
    }
}
