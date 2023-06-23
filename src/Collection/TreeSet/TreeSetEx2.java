package Collection.TreeSet;

import org.jetbrains.annotations.NotNull;

import java.util.Objects;
import java.util.TreeSet;

public class TreeSetEx2 {
    public static void main(String[] args) {
        TreeSet <Student> treeSet = new TreeSet<>();
        Student student1 = new Student("Rahmon",2);
        Student student2 = new Student("Maksud",3);
        Student student3 = new Student("Anton",4);
        Student student4 = new Student("Umar",1);
        Student student5 = new Student("Bobur",5);
        treeSet.add(student3);
        treeSet.add(student2);
        treeSet.add(student4);
        treeSet.add(student1);
        treeSet.add(student5);

        Student student6 = new Student("Umar",1);
        Student student7 = new Student("Bobur",5);
        System.out.println(treeSet.subSet(student6,student7));



    }
}


class Student implements Comparable <Student>{
    String name;
    int course;

    public Student(String name, int course) {
        this.name = name;
        this.course = course;
    }




    @Override
    public String
    toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", course=" + course +
                '}';
    }
    @Override
    public int compareTo(@NotNull Student anotherSt) {
        return this.course - anotherSt.course;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return course == student.course;
    }

    @Override
    public int hashCode() {
        return Objects.hash(course);
    }
}
