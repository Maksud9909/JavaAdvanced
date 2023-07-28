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
        List<String> list1 = list.stream().filter(name-> name.length() > 5).collect(Collectors.toList());
        List<String> list2 = list.stream().sorted().collect(Collectors.toList());
        System.out.println(list2);
        System.out.println(list1);
    }
}
