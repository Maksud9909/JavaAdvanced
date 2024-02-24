package Multithreading.LockReentrantLock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Bankomat {
    public static void main(String[] args) {
        Lock lock = new ReentrantLock();
        new Employee("Maksud",lock);
        new Employee("Anton",lock);
        new Employee("Elena",lock);

    }

}


class Employee extends Thread{
    String name;
    private Lock lock;

    public Employee(String name, Lock lock) {
        this.name = name;
        this.lock = lock;
        this.start();
    }

    public void run(){
        if (lock.tryLock()){ // если получается зайти, то заходит если нет, то просто идет в else
            try {
            System.out.println(name + " started using ATM");
            Thread.sleep(2000);
            System.out.println(name + " ends using ATM");
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        finally {
            lock.unlock();
        }
    }
        else {
            System.out.println("They do not want to sue atm, because of the queue");
        }
    }
}