package Collection.TreeMap;

import Collection.HashMap.hashcode1.Student;

import java.util.TreeMap;

public class TreeMapExample {
    public static void main(String[] args) {
        TreeMap<Student, Double> treeMap = new TreeMap<>();
        Student st1 = new Student("Maksud","Rustamov",1);
        Student st2 = new Student("Murad","Rustamov",3);
        Student st3 = new Student("Nafisa","Jumaeva",5);
        Student st4 = new Student("Anton","Zubov",1);
        Student st5 = new Student("Sasha","Elkin",3);
        Student st6 = new Student("Andrei","U",2);
        Student st7 = new Student("Yagami","Layt",2);
        treeMap.put(st1,7.5);
        treeMap.put(st3,6.8);
        treeMap.put(st4,6.3);
        treeMap.put(st7,9.2);
        treeMap.put(st6,4.5);
        treeMap.put(st5,9.0);
        treeMap.put(st2,4.2);

        System.out.println(treeMap);



    }

}
