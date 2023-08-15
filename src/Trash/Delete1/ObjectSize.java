package Trash.Delete1;

import java.lang.instrument.Instrumentation;

public class ObjectSize {
    public static void main(String[] args) throws InterruptedException {
        Multi multi = new Multi();
        Multi2 multi2 = new Multi2();



    }
}

class Multi extends Thread{
    static int counter = 0;
    public static synchronized void plus (){
        counter++;
    }
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
            plus();
        }
        System.out.println("result " + counter);
    }
}
class Multi2 extends Thread{
    @Override
    public void run() {
        System.out.println("Hello");
        for (int i = 10; i < 20; i++) {
            System.out.println(i);
            Multi.plus();
        }
        System.out.println("result " + Multi.counter);
    }
}