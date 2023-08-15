package Trash.Delete1;

public class Test5 {
    public static void main(String[] args) throws InterruptedException {
        Thread10 thread10 = new Thread10();
        Thread10 thread101 = new Thread10();
        thread101.start();
        thread10.start();
        System.out.println();
        System.out.println("Hello");

    }

}


class Thread10 extends Thread{
    volatile int res = 100;
    @Override
    public  void run() {
        for (int i = 0; i < res; i++) {
            System.out.print(i + " ");
        }
    }
}