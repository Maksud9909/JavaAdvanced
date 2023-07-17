package Lambda.LambdaExxpressions;

import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.Objects;

public class StudentInfo2 {
    void testStudents (ArrayList<Student> arrayList , StudentCheck studentCheck){
        for(Student st: arrayList){
            if (studentCheck.check(st)){
                System.out.println(st);
            }
        }
    }
}

class Test2 {
    public static void main(String[] args) {
        Student student1 = new Student("Maksud", 'm', 18, 1, 4.5);
        Student student2 = new Student("Umar", 'm', 17, 2, 5);
        Student student3 = new Student("Murad", 'm', 19, 3, 4);
        Student student4 = new Student("Hamidullo", 'm', 24, 4, 4.3);
        Student student5 = new Student("Madina", 'f', 17, 1, 5);

        ArrayList<Student> students = new ArrayList<>();
        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student4);
        students.add(student5);

        StudentInfo2 info = new StudentInfo2();
//        info.testStudents(students, new CheckOverGrade2());
        System.out.println("-------");
        info.testStudents(students, new StudentCheck() {
            @Override
            public boolean check(Student student) {
                return student.avgGrade>=4.5;
            }
        });
        System.out.println("------");

        info.testStudents(students, (Student student) -> {return student.avgGrade>4.4;});
        System.out.println("-----");

        info.testStudents(students, (Student student) -> {return student.age>17;});
        System.out.println("-------");

        info.testStudents(students, (Student student) -> {
            return student.sex=='m' && student.avgGrade>4.4 && student.course>1;});



    }

}


interface StudentCheck2 {
    boolean check(Student student);
}


