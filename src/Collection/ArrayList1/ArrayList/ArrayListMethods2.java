package Collection.ArrayList1.ArrayList;

import java.util.ArrayList;

public class ArrayListMethods2 {
    public static void main(String[] args) {
        Student st1 = new Student ("Ivan",'m',  34,4,8.5);
        Student st2 = new Student (  "Nikolay", 'm',  28, 2,  6.4);
        Student st3 = new Student (  "Elena",  'f',  19,  1,  8.9);
        Student st4 = new Student (  "Petr", 'm',  35,  4,  7) ;
        Student st5 = new Student ( "Mariya", 'f',  23,  3,  7.4);
        ArrayList <Student> arrayList = new ArrayList<>();
        arrayList.add(st1);
        arrayList.add(st2);
        arrayList.add(st3);
        arrayList.add(st4);
        arrayList.add(st5);
        Student st6 = new Student ( "Mariya", 'f',  23,  3,  7.4);
        arrayList.add(st6);
        System.out.println(arrayList);
        arrayList.remove(st6);
        System.out.println(arrayList);

    }
}
class Student{
    private String name;
    private char sex;
    private int age;
    private int course;
    private double avgGrade;
    public Student (String name, char sex, int age, int course, double avgGrade) {
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.course = course;
        this.avgGrade = avgGrade;
    }

    @Override
    public String toString() {
        return "Trash.Student{" +
                "name='" + name + '\'' +
                ", sex=" + sex +
                ", age=" + age +
                ", course=" + course +
                ", avgGrade=" + avgGrade +
                '}';
    }

//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        Trash.Student student = (Trash.Student) o;
//        return sex == student.sex && age == student.age && course == student.course && Double.compare(student.avgGrade, avgGrade) == 0 && Objects.equals(name, student.name);
//    }
}