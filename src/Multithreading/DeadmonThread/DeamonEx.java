package Multithreading.DeadmonThread;

public class DeamonEx {
    public static void main(String[] args) {
        System.out.println("Main thread starts");
        UserThread userThread =new UserThread();
        userThread.setName("userThread");


        DeamonThread deamonThread = new DeamonThread();
        deamonThread.setName("deamonThread");
        deamonThread.setDaemon(true); // теперь он демон
        userThread.start();
        deamonThread.start();



        System.out.println("Main thread ends");
    }
}


class UserThread extends Thread{
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + "is Daemon " + isDaemon()); // мы проверяем является ли он демоном
        for (char i = 'A'; i<='J'; i++){
            try {
                sleep(300);
                System.out.println(i);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }


}


class DeamonThread extends Thread{
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + "is Daemon " + isDaemon()); // мы проверяем является ли он демоном
        for (int i = 0; i<1000; i++){
            try {
                sleep(100);
                System.out.println(i);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }


}