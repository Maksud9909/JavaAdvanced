package Multithreading.CallableandFuture;

import java.util.concurrent.*;

public class CallableFactorial {
    public static void main(String[] args) throws InterruptedException, ExecutionException {
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        Factorial2 factorial2 = new Factorial2(5);
        Future<Integer> future = executorService.submit(factorial2); // это нужно для callable, так как execute мы не сможем вызвать
        System.out.println("want to get a result");
        System.out.println(future.get());
        executorService.awaitTermination(1, TimeUnit.SECONDS);
        executorService.shutdown();
    }
}

class Factorial2 implements Callable<Integer> { // нужно ввести тип который вы будете возвращать
    int f;

    public Factorial2(int f) {
        this.f = f;
    }

    @Override
    public Integer call() throws Exception {
        if (f<=0){
            throw new Exception("Wrong number");
        }
        int res = 1;
        for (int i = 1; i <=f; i++) {
            res*=i;
            Thread.sleep(1000);
        }
        return res;
    }
}
