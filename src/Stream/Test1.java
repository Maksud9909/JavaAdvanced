package Stream;

import java.lang.reflect.Array;
import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Test1 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Maksud");
        list.add("Anton");
        list.add("Donty");
        list.add("Fedya");
        list.add("Madina");
        System.out.println(list);

        System.out.println(list.stream().map(str -> str.length()).collect(Collectors.toList()));

        int array [] = {1,2,4,5,6,64,3,3};
       int arr [] = Arrays.stream(array).map(ints -> {
           int result = 0;
            if (ints%3==0){
                result+= ints;
            }
                return result;

        }).toArray();
        System.out.println(Arrays.toString(arr));

        Set<String> set = new TreeSet<>();
        set.add("Maksud");
        set.add("Firdavs");
        set.add("Donty");
        set.add("Abdu");

        Set<Integer> setRes = set.stream().map(str -> str.length()).collect(Collectors.toSet());
        System.out.println(setRes);



    }
}
