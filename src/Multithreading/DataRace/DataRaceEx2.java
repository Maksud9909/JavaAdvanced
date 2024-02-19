package Multithreading.DataRace;

import Trash.Test9;

public class DataRaceEx2 implements Runnable{

    public static void main(String[] args) {
        Thread thread = new Thread(new DataRaceEx2());
        thread.start();
    }

    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {

        }
    }
}

class Counter2{
    static int counter = 0;
    public static void increment(){
        counter++;
    }
}
