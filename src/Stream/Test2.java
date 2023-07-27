package Stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Test2 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Sasha");
        list.add("Rayxona");
        list.add("Masha");
        list.add("Donty");
        List<String> list1 = list.stream().filter(str -> str.length() > 4).collect(Collectors.toList());
        System.out.println(list1);
        System.out.print("hh");
    }
}
