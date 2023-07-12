package Trash;

import java.lang.reflect.Array;
import java.util.*;

public class Test4 {
    public static void main(String[] args) {
//        HashMap<People,Integer> hashMap = new HashMap<>();
//        People people1 = new People("Maksud",18);
//        People people2 = new People("Anton",23);
//        hashMap.put(people2,1);
//        hashMap.put(people1,2);
//        System.out.println(people1.hashCode());
//        System.out.println(people2.hashCode());
//
//        System.out.println(hashMap);

        LinkedHashMap<String,Integer> hashtable = new LinkedHashMap<>(16,075f);
    }
}


class People {
    String name;
    int age;

    @Override
    public String toString() {
        return "People{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public boolean equals(Object o) {

        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        People people = (People) o;
        return age == people.age && Objects.equals(name, people.name);
    }

//    @Override
//    public int hashCode() {
//        return Objects.hash(name, age);
//    }

    public People(String name, int age) {
        this.name = name;
        this.age = age;
    }
}