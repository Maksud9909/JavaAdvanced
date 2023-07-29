package Stream.Sorted;



import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Example {
    public static void main(String[] args) {
        Stream.Student student1 = new Stream.Student("Maksud",'m',18,1,8.5);
        Stream.Student student2 = new Stream.Student("Madina",'f',17,1,9.0);
        Stream.Student student3 = new Stream.Student("Muslima",'f',21,3,7.6);
        Stream.Student student4 = new Stream.Student("Anton",'m',23,5,9.1);
        Stream.Student student5 = new Stream.Student("firdavs",'m',19,1,8.3);
        List<Stream.Student> list = new ArrayList<>();
        list.add(student1);
        list.add(student2);
        list.add(student4);
        list.add(student5);
        list.add(student3);
        System.out.println(list);
        list = list.stream().sorted((a,b)->
                       a.getCourse() - b.getCourse()
                ).collect(Collectors.toList());
        System.out.println(list);
    }
}
