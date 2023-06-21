package Collection.TreeMap;

import Collection.HashMap.hashcode1.Student;

import java.util.TreeMap;

public class Test1 {
    public static void main(String[] args) {
        TreeMap <Integer, Student> treeMap = new TreeMap<>();
        Student st2 = new Student("Murad","Rustamov",3);
        Student st3 = new Student("Nafisa","Jumaeva",5);
        Student st4 = new Student("Anton","Jumaev",5);
        treeMap.put(2,st2);
        treeMap.put(1,st3);
        System.out.println(treeMap);

        treeMap.put(2,st4);
        System.out.println(treeMap);




    }
}
