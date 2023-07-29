package Lambda.LambdaExxpressions;

import org.jetbrains.annotations.NotNull;
import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Objects;

import java.util.function.Predicate;
public class StudentInfo2 {
    void testStudents (@NotNull ArrayList<Student> arrayList , Predicate<Student> predicate){
        for(Student st: arrayList){
            if (predicate.test(st)){
                System.out.println(st);
            }
        }
    }
}


class Test2 {
    public static void main(String[] args) {
        Student student1 = new Student("Maksud", 'm', 18, 1, 4.5);
        Student student2 = new Student("Umar", 'm', 17, 2, 5);
        Student student3 = new Student("Murad", 'f', 19, 3, 3);
        Student student4 = new Student("Hamidullo", 'm', 24, 4, 4.3);
        Student student5 = new Student("Madina", 'f', 17, 1, 3);
        ArrayList<Student> students = new ArrayList<>();
        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student4);
        students.add(student5);
        StudentInfo2 info = new StudentInfo2();
        System.out.println(students);


        Collections.sort(students,(Student st1,Student st2)->{
            return st1.age - st2.age;
        });
        System.out.println(students);
        System.out.println("------");


        info.testStudents(students, student -> student.age>17 && student.name.equals("Maksud"));
        System.out.println("-------");


        info.testStudents(students,(Student student) -> {
            return student.sex == 'f';
        });
        System.out.println("-----");

        Predicate<Student> predicate1 = student -> student.age > 18;
        Predicate<Student> predicate2 = student -> student.sex == 'f';
        info.testStudents(students,predicate1.negate());









    }

}



//        Collections.sort(students, new Comparator<Trash.Student>() {
//            @Override
//            public int compare(Trash.Student st1, Trash.Student st2) {
//                int result = 0;
//                return st1.age - st2.age;
//            }
//        });
//        System.out.println(students);