package Stream.Limit;

import Stream.Student;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Limit {
    public static void main(String[] args) {
        Student student1 =  new Student("Murod",'m',34,3,9.6);
        Student student2 =  new Student("Jessi",'f',23,4,8.5);
        Student student3 =  new Student("Xasan",'m',20,5,8.0);
        Student student4 =  new Student("Grisha",'m',18,2,7.9);
        Student student5 =  new Student("Alisher",'f',19,1,9.7);
        Student student6 =  new Student("Anton",'f',25,3,8.9);
        List<Student> list = Arrays.asList(student1,student2,student3,student6,student4,student5);

        List<Student> result  = list.stream().filter(student -> student.age>=20).limit(2).collect(Collectors.toList());
        System.out.println(result);
    }
}
