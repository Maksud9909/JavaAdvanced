package Trash;

public class Multi {
    public static void main(String[] args) throws InterruptedException {
        Runnable runnable1 = new Runnable() {
            @Override
            public synchronized void run() {
                for (int i = 0; i < 10; i++) {
                    System.out.println("Maksud");
                }
            }
        };

        Runnable runnable2 = new Runnable() {
            @Override
            public synchronized void run() {
                for (int i = 0; i < 10; i++) {
                    System.out.println("Anton");
                }
            }
        };

        Thread thread1 = new Thread(runnable1);
        Thread thread2 = new Thread(runnable2);

        thread1.start();
        thread2.start();
        thread1.join();
        thread2.join();

        System.out.println("End of main" );





    }
}
