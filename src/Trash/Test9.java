package Trash;

public class Test9 implements Runnable{
    private int counter = 0;
    @Override
    public void run() {
        counter++;
    }

    public int getCounter() {
        return counter;
    }

    public static void main(String[] args) {
        Test9 test9 = new Test9();
        Thread thread = new Thread(test9);
        thread.run();
        int changed = test9.getCounter();
        System.out.println(changed);
    }



}


