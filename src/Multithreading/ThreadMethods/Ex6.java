package Multithreading.ThreadMethods;

public class Ex6 {
    public static void main(String[] args) {
        MyThread5 myThread5 = new MyThread5();
        myThread5.setName("Maksud");
        myThread5.setPriority(10);
        System.out.println("Name " + myThread5.getName() + " priority " + myThread5.getPriority());
    }
}

class MyThread5 extends Thread{

    @Override
    public void run() {
        System.out.println("Privet");
    }
}