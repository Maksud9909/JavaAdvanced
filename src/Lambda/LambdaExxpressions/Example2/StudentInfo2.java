package Lambda.LambdaExxpressions.Example2;

import Lambda.LambdaExxpressions.*;

import java.util.ArrayList;

public class StudentInfo2 {
    public void studentTest (ArrayList<Student> al,StudentCheck studentCheck){
        for (Student st:
             al) {
            if (studentCheck.checkSt(st)){
                System.out.println(st);
            }
        }
    }
}



class Test{
    public static void main(String[] args) {
        Student student = new Student("Maksud",'m',18,1,8.5);
        ArrayList <Student> students = new ArrayList<>();
        students.add(student);
        StudentInfo2 info = new StudentInfo2();
//        info.studentTest(students,stud -> stud);




    }
}


interface StudentCheck{
    boolean checkSt(Student student);
}