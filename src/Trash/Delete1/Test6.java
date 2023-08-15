package Trash.Delete1;

import javax.naming.ldap.SortResponseControl;
import java.sql.PreparedStatement;
import java.util.ConcurrentModificationException;

public class Test6 {
    public static void main(String[] args) throws InterruptedException {
        Thread8 thread8 = new Thread8();
        Thread thread1 = new Thread(thread8);
        Thread thread2 = new Thread(thread8);
        thread1.start();
        thread2.start();
        thread1.join();
        thread2.join();

        System.out.println(Thread8.result);




    }
}

class Thread8 implements Runnable {
    static int result = 0;

     public synchronized static void word(){
         result++;
     }

    @Override
    public  void run() {
        for (int i = 0; i < 1000; i++) {
            word();;
        }
    }
}