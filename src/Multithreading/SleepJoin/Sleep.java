package Multithreading.SleepJoin;

public class Sleep {
    public static void main(String[] args) throws InterruptedException {
        for (int i = 5; i > 0; i--) {
            System.out.println(i);
            Thread.sleep(1000);
        }
        System.out.println("Let's gou");
    }
}
