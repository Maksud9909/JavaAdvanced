package Trash.Delete1;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test3 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        numbers.stream().map(number-> {
           number*=2;
           return number;
        }).forEach(number-> System.out.println(number));

        System.out.println("----------------------");

        List<String> words = Arrays.asList("apple", "banana", "cherry", "date");
        List<Integer> list = words.stream().map(number-> number.length()).collect(Collectors.toList());
        System.out.println(list);

        System.out.println("-------------");

//        List<LocalDate> dates = Arrays.asList(
//                LocalDate.of(2023, 1, 15),
//                LocalDate.of(2023, 3, 22),
//                LocalDate.of(2023, 7, 10)
//        );
//        List<Integer> list1 = dates.stream().map(date->date.g).collect(Collectors.toList());
//        System.out.println(list1);


        List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "David");
        names.stream().map(name->name.substring(0,1)).forEach(name-> System.out.println(name));

        System.out.println("-------------");

        List<Double> decimals = Arrays.asList(3.14, 2.71, 4.67, 1.23);
        decimals.stream().map(num-> Math.round(num)).forEach(num-> System.out.println(num));








    }

}

