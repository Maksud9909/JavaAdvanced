package Stream.Chaining;

import Stream.Student;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ChainingEx2 {
    public static void main(String[] args) {
        Stream.Student student1 = new Stream.Student("Maksud",'m',18,1,8.5);
        Stream.Student student2 = new Stream.Student("Madina",'f',17,1,9.0);
        Stream.Student student3 = new Stream.Student("Muslima",'f',21,3,7.6);
        Stream.Student student4 = new Stream.Student("Anton",'m',23,5,9.1);
        Stream.Student student5 = new Stream.Student("Firdavs",'m',19,1,8.3);
        List<Student> list = new ArrayList<>();
        list.add(student1);
        list.add(student2);
        list.add(student4);
        list.add(student5);
        list.add(student3);

        List<Student> result = list.stream().map(student->
        {student.setName(student.getName().toUpperCase()); return student;}).
                filter(student -> student.getSex() == 'f').
                sorted((a,b)-> a.getAge()-b.getAge()).collect(Collectors.toList());
       result.forEach(System.out::println);
    }
}
