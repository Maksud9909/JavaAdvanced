package Lambda.LambdaExxpressions;

import java.util.ArrayList;

public class StudentInfo {

    void testStudents (ArrayList<Student> arrayList , StudentCheck studentCheck){
        for(Student st: arrayList){
            if (studentCheck.check(st)){
                System.out.println(st);
            }
        }
    }


//    void printStudentsOverGrade(ArrayList <Student> ar, double grade){
//        for (Student st:
//             ar) {
//            if (st.avgGrade>grade){
//                System.out.println(st.avgGrade + " nice score " + st.name);
//            }
//        }
//    }
//    void printStudentsUnderAge(ArrayList <Student> ar, int age){
//        for (Student st:
//             ar) {
//            if (st.age>age){
//                System.out.println(st.name + " is " + st.age + " years old");
//            }
//        }
//    }
//    void printStudentsMixCondition(ArrayList <Student> ar, int age,double grade, char sex){
//        for (Student st:
//             ar) {
//            if (st.age > age && st.avgGrade >= grade && st.sex == sex){
//                System.out.println(st);
//            }
//        }
//    }
}

class Test {
    public static void main(String[] args) {
        Student student1 = new Student("Maksud", 'm', 18, 1, 4.5);
        Student student2 = new Student("Umar", 'm', 17, 2, 5);
        Student student3 = new Student("Murad", 'm', 19, 3, 4);
        Student student4 = new Student("Hamidullo", 'm', 24, 4, 4.3);
        Student student5 = new Student("Madina", 'f', 17, 1, 5);

        ArrayList<Student> studentList = new ArrayList<>();
        studentList.add(student1);
        studentList.add(student2);
        studentList.add(student3);
        studentList.add(student4);
        studentList.add(student5);


//        StudentInfo info = new StudentInfo();
//        info.printStudentsOverGrade(studentList,4.4);
//        info.printStudentsUnderAge(studentList,17);
//        System.out.println("----------");
//        info.printStudentsMixCondition(studentList,17,4.5,'m');
    }

}


interface StudentCheck {
    boolean check(Student student);
}


class CheckOverGrade implements StudentCheck {

    @Override
    public boolean check(Student student) {
        return student.avgGrade>=4.4;
    }
}















