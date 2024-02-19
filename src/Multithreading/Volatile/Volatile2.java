package Multithreading.Volatile;

public class Volatile2 {
    static long start;
    static long end;
    private volatile boolean flag = false; // теперь он будет храниться в памяти, а не в кэше

    public void flagTrue(){
     flag = true;
    }

    public boolean getFlag() {
        return flag;
    }

    public static void main(String[] args) {
        Volatile2 volatilee = new Volatile2();

        Thread thread1 = new Thread(()->{
            volatilee.flagTrue();
             start = System.currentTimeMillis();
        });



        Thread thread2 = new Thread(()->{
            while (!volatilee.getFlag()) {

            }

            System.out.println("Flag is true");
            end = System.currentTimeMillis();
        });



        thread1.start();
        thread2.start();

        System.out.println(end - start);
    }
}


