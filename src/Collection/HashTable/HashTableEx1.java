package Collection.HashTable;

import Collection.HashMap.hashcode1.Student;

import java.util.Hashtable;

public class HashTableEx1 {
    public static void main(String[] args) {
        Hashtable<Double, Student> hashtable = new Hashtable<>(16,0.75f);
        Student st1 = new Student("Maksud","Rustamov",1);
        Student st3 = new Student("Nafisa","Jumaeva",5);
        Student st4 = new Student("Anton","Zubov",1);
        Student st7 = new Student("Yagami","Layt",2);
        hashtable.put(7.5,st1);
        hashtable.put(6.8,st3);
        hashtable.put(6.3,st4);
        hashtable.put(9.2,st7);
        System.out.println(hashtable);
    }
}
