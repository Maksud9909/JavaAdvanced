package Z;

import com.sun.source.tree.Tree;

import java.util.*;

public class Test1 {
    public static void main(String[] args) {
        TreeMap<Integer,String> treeMap = new TreeMap<>();
        treeMap.put(10,"Eco-Bozor");
        treeMap.put(20,"Kuyluk");
        System.out.println(treeMap.firstEntry());

        TreeMap<Character,String> key = new TreeMap<>();
        key.put('M',"Maksud");
        System.out.println(key);


    }

}
