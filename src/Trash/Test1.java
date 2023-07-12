package Trash;

import com.sun.source.tree.Tree;

import java.util.*;

public class Test1 {
    public static void main(String[] args) {
        LinkedHashMap<String,Integer> hashMap = new LinkedHashMap<>();
        hashMap.put("Maksud",18);
        hashMap.put("Anton",19);
        hashMap.put("Anton",12);
        System.out.println(hashMap);
        System.out.println("Hello world");
    }

}
