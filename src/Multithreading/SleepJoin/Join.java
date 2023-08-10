package Multithreading.SleepJoin;

public class Join extends Thread{
    public void run (){
        for (int i = 0; i < 10; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println(Thread.currentThread().getName() + " " + i );
        }
    }
    public static void main(String[] args) throws InterruptedException {
        Join join = new Join();
        join.start();
        join.join();
    }
}
