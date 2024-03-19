package reviewForJob;

import Lambda.Test;
import com.sun.security.jgss.GSSUtil;

import java.lang.reflect.Field;
import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Test1 {


    public static void main(String[] args) {
        ExecutorService executor = Executors.newCachedThreadPool();

        for (int i = 0; i < 100; i++) {
            executor.execute(new Run());
        }
        executor.shutdown();


    }
}



class Run implements Runnable{

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
    }
}



















