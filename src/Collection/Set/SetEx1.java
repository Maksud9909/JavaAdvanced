package Collection.Set;

import java.util.HashSet;
import java.util.Set;

public class SetEx1 {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("Maksud");
        set.add("Anton");
        set.add("Shokhafiz");
        set.add("Donty");
        set.remove("Donty");
        for (String s: set){
            System.out.println(s);
        }
        System.out.println(set.contains("Anton"));
        System.out.println();

    }

}
