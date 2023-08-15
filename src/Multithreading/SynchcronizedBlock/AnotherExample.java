package Multithreading.SynchcronizedBlock;

public class AnotherExample {
    static final Object lock = new Object();
    public static void main(String[] args) {
        Thread thread1 = new Thread(new RunnableMobile());
        Thread thread2 = new Thread(new RunnableWhatsApp());
        Thread thread3 = new Thread(new RunnableSkype());
        thread1.start();
        thread2.start();
        thread3.start();
    }
    void mobileCall() {
        synchronized (lock) {
            System.out.println("Mobile call starts");
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Mobile call ends");
        }
    }
    void whatsAppCall() {
        synchronized (lock) {
            System.out.println("WhatsApp call starts");
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("WhatsApp call ends");
        }
    }
    void skypeCall()  {
        synchronized (lock){
        System.out.println("Skype call starts");
        try {
            Thread.sleep(6000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Skype call ends");
    }
}
}

class RunnableMobile implements Runnable{

    @Override
    public void run() {
        new AnotherExample().mobileCall();
    }
}

class RunnableWhatsApp implements Runnable{

    @Override
    public void run() {
        new AnotherExample().whatsAppCall();
    }
}
class RunnableSkype implements Runnable{

    @Override
    public void run() {
        new AnotherExample().skypeCall();
    }
}







