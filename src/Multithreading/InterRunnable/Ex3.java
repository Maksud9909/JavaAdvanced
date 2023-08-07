package Multithreading.InterRunnable;

public class Ex3 {
    public static void main(String[] args) {
        Thread thread1 = new Thread(new MyThread3());
        Thread thread2 = new Thread(new MyThread4());
        thread1.run();
        thread2.run();
    }
}

class MyThread3 implements Runnable{
    @Override
    public void run (){
        for (int i = 0; i <= 1000; i++) {
            System.out.println(i);
        }
    }
}
class MyThread4 implements Runnable {
    @Override
    public void run (){
        for (int i = 1000; i > 0; i--) {
            System.out.println(i);
        }
    }
}

