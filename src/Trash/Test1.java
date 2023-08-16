package Trash;





public class Test1 {
    static int counter = 0;
    public static synchronized void plus (){
        counter++;
    }

    public static void main(String[] args) throws InterruptedException {
        T t = new T();
        Thread thread1 = new Thread(t);
        Thread thread2 = new Thread(t);
        thread1.start();
        thread2.start();
        thread2.join();
        thread1.join();

        System.out.println(counter);

    }
}

class T implements Runnable{

    @Override
    public void run() {
        for (int i = 0; i < 200; i++) {
            Test1.plus();
        }
    }
}