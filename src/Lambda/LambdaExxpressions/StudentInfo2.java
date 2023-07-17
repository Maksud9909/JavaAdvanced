package Lambda.LambdaExxpressions;

import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Objects;

public class StudentInfo2 {
    void testStudents (ArrayList<Student> arrayList , StudentCheck2 studentCheck2){
        for(Student st: arrayList){
            if (studentCheck2.check(st)){
                System.out.println(st);
            }
        }
    }
}

class Test2 {
    public static void main(String[] args) {
        Student student1 = new Student("Maksud", 'm', 18, 1, 4.5);
        Student student2 = new Student("Umar", 'm', 17, 2, 5);
        Student student3 = new Student("Murad", 'm', 19, 3, 3);
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


//        Collections.sort(students, new Comparator<Student>() {
//            @Override
//            public int compare(Student st1, Student st2) {
//                int result = 0;
//                return st1.age - st2.age;
//            }
//        });
//        System.out.println(students);


        Collections.sort(students,(Student st1,Student st2)->{
            return st1.age - st2.age;
        });
        System.out.println(students);



//        info.testStudents(students, new StudentCheck2() {
//            @Override
//            public boolean check(Student student) {
//                return student.avgGrade>=4.5;
//            }
//        });
//        System.out.println("------");
//
//
//        info.testStudents(students, student -> student.age>17 && student.name.equals("Maksud"));
//
//        System.out.println("-------");
//        info.testStudents(students, new StudentCheck2() {
//            @Override
//            public boolean check(Student student) {
//                return student.avgGrade>4;
//            }
//        });
//
//        System.out.println("-------");
//
//        info.testStudents(students,(Student student) -> {
//            return student.sex == 'f';
//        });
//
//        System.out.println("-----");
//
//        StudentCheck2 st = (Student student) -> {
//            return student.name.equals("Maksud");
//        };
//        info.testStudents(students, st);









    }

}


interface StudentCheck2 {
    boolean check(Student student);
}


