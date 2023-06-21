package Collection.HashMap.hashcode1;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

public class HashCode1 {
    public static void main(String[] args) {
        Map<Student,Integer> map = new HashMap<>();
        Student st1 = new Student("Maksud","Rustamov",1);
        Student st2 = new Student("Murad","Rustamov",3);
        Student st3 = new Student("Nafisa","Jumaeva",5);
        map.put(st1,456);
        map.put(st2,234);
        map.put(st3,245);
        System.out.println(map);
        System.out.println(st1);

        Student st4 = new Student("Maksud","Rustamov",1);
        Boolean result = map.containsKey(st4);
        System.out.println(result);
        System.out.println(st1.hashCode());
        System.out.println(st4.hashCode());
        ConcurrentHashMap <String,Integer>concurrentHashMap = new ConcurrentHashMap<>();
        concurrentHashMap.put("Maksud",18);
        System.out.println(concurrentHashMap);

        System.out.println("-------");


        for (Map.Entry<Student,Integer> entry: map.entrySet()){
            System.out.println(entry.getKey() + ":" + entry.getValue());
        }


    }

}

