package Generics.Test1;

import java.util.ArrayList;
import java.util.List;

public class Test1 {
    public static void main(String[] args) {
        List <String>list = new ArrayList<>();
        list.add("Maksud");
        list.add("Murad");
        list.add("Nafisa");
        for (String s:
                list) {
            System.out.print(s + " ");
        }
    }
}
class Car {}