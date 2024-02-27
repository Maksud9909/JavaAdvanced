package Multithreading.Interaption;

public class InteraptionEx {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Method main starts");
        InterruptedThread thread = new InterruptedThread();
        thread.start();
        Thread.sleep(2000);
        thread.interrupt(); // это значит, что поток main хочет прервать этот поток
        thread.join();



        System.out.println("Method main ends");
    }
}


class InterruptedThread extends Thread{
  double sqrtSum = 0;
    @Override
    public void run() {
        for (int i = 0; i <= 1000000000; i++) {
            if (isInterrupted()){
                System.out.println("Thread has been interupted by method");
                return; // тут надо обязательно писать return, иначе метод продолжит работать
            }
            else {
                sqrtSum+=Math.sqrt(i);
            }
        }
        System.out.println(sqrtSum);
    }
}