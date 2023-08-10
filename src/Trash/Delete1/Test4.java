package Trash.Delete1;

public class Test4 {
    public static void main(String[] args) {
        Thread thread = new Thread(new MyThread());
        thread.start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 9; i++) {
                    System.out.println("Privet");
                }
            }
        }).start();


    }
}


class MyThread implements Runnable{

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Hello world " + i );
        }
    }
}