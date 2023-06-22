package Collection.LinkedHashMap;

import Collection.HashMap.hashcode1.Student;

import java.util.LinkedHashMap;

public class LinkedHashMapEx1 {
    public static void main(String[] args) {
        LinkedHashMap<Double, Student> lhm = new LinkedHashMap<>(16,0.75f,true);
        Student st1 = new Student("Maksud","Rustamov",1);
        Student st3 = new Student("Nafisa","Jumaeva",5);
        Student st4 = new Student("Anton","Zubov",1);
        Student st7 = new Student("Yagami","Layt",2);
        lhm.put(7.5,st1);
        lhm.put(6.8,st3);
        lhm.put(6.3,st4);
        lhm.put(9.2,st7);

        System.out.println(lhm);
    }
}
