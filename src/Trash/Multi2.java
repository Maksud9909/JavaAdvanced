package Trash;

import java.util.concurrent.atomic.AtomicInteger;

public class Multi2 {
    private static AtomicInteger counter = new AtomicInteger(0);

    public static void main(String[] args) {
        Thread thread1 = new Thread(() -> increment());
        Thread thread2 = new Thread(() -> increment());

        thread1.start();
        thread2.start();
    }

    public static void increment() {
        for (int i = 0; i < 10; i++) {
            counter.incrementAndGet();
        }
        System.out.println(counter.get());
    }
}
