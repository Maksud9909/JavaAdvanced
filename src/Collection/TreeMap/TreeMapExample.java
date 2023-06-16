package Collection.TreeMap;

import Collection.HashMap.hashcode1.Student;

import java.util.TreeMap;

public class TreeMapExample {
    public static void main(String[] args) {
        TreeMap<Double, Student> treeMap = new TreeMap<>();
        Student st1 = new Student("Maksud","Rustamov",1);
        Student st2 = new Student("Murad","Rustamov",3);
        Student st3 = new Student("Nafisa","Jumaeva",5);
        Student st4 = new Student("Anton","Zubov",1);
        Student st5 = new Student("Sasha","Elkin",3);
        Student st6 = new Student("Andrei","U",2);
        Student st7 = new Student("Yagami","Layt",2);
        treeMap.put(5.7,st2);
        treeMap.put(6.9,st1);
        treeMap.put(8.9,st3);
        treeMap.put(5.6,st4);
        treeMap.put(9.8,st7);
        treeMap.put(4.1,st5);
        treeMap.put(7.8,st6);
        System.out.println(treeMap);



    }
}
