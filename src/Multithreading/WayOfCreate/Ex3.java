package Multithreading.WayOfCreate;



public class Ex3 implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            System.out.println("hello world");
        }
    }
    public static void main(String[] args) {
        Thread thread = new Thread(new Ex3());
        thread.start();
        for (int i = 100; i > 0 ; i--) {
            System.out.println(i+1);
        }



    }

}



