package Trash;

import java.util.LinkedHashMap;

public class Test2 {
    public static void main(String[] args) {
        LinkedHashMap<String,Integer> hashMap = new LinkedHashMap<>(16,0.75f,true);
        hashMap.put("Lavash",7);
        hashMap.put("Ocean food",4);
        hashMap.put("Rolls",4);
        hashMap.put("Sushi",5);
        System.out.println(hashMap.get("Rolls"));
        System.out.println(hashMap);

    }
}
