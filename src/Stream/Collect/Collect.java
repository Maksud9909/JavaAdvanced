package Stream.Collect;

import Stream.Student;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Collect {
    public static void main(String[] args) {
        Stream.Student student1 = new Stream.Student("Maksud",'m',18,1,8.5);
        Stream.Student student2 = new Stream.Student("Madina",'f',17,1,9.0);
        Stream.Student student3 = new Stream.Student("Muslima",'f',21,3,7.6);
        Stream.Student student4 = new Stream.Student("Anton",'m',23,5,9.1);
        Stream.Student student5 = new Stream.Student("Firdavs",'m',19,1,8.3);
        List<Student> students = new ArrayList<>();
        students.add(student1);
        students.add(student2);
        students.add(student4);
        students.add(student5);
        students.add(student3);


        Map<Integer,List<Student>> map = students.stream().map(student -> {
            student.getName().toUpperCase();
            return student;
        }).collect(Collectors.groupingBy(student -> student.getCourse()));


    }
}
