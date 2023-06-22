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
        treeMap.put(7.5,st1);
        treeMap.put(6.8,st3);
        treeMap.put(6.3,st4);
        treeMap.put(9.2,st7);
        treeMap.put(4.5,st6);
        treeMap.put(9.0,st5);
        treeMap.put(4.2,st2);
        System.out.println(treeMap);
        System.out.println(treeMap.get(7.5));
        System.out.println(treeMap.tailMap(7.0)); // он показывает все ключи выше 7
        System.out.println(treeMap.headMap(7.0)); // он показывает все ключи ниже 7
        System.out.println(treeMap.lastEntry());
        System.out.println(treeMap.firstEntry());



    }

}
