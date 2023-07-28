package Stream.Filter;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Filter {
    public static void main(String[] args) {
        Student student1 = new Student("Maksud",'m',18,1,8.5);
        Student student2 = new Student("Madina",'f',17,1,9.0);
        Student student3 = new Student("Muslima",'f',21,3,7.6);
        Student student4 = new Student("Anton",'m',23,5,9.1);
        Student student5 = new Student("firdavs",'m',19,1,8.3);
        List<Student> list = new ArrayList<>();
        list.add(student1);
        list.add(student2);
        list.add(student3);
        list.add(student4);
        list.add(student5);

        List<Student> listResult = list.stream().
                filter(student -> student.getAge() > 20 && student.getAvgGrade() > 7.5 ).collect(Collectors.toList());
        System.out.println(listResult);

    }

}


class Student {
    private String name;
    private char sex;
    private int age;
    private int course;
    private double avgGrade;

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", sex=" + sex +
                ", age=" + age +
                ", course=" + course +
                ", avgGrade=" + avgGrade +
                '}';
    }

    public Student(String name, char sex, int age, int course, double avgGrade) {
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.course = course;
        this.avgGrade = avgGrade;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public double getAvgGrade() {
        return avgGrade;
    }

    public void setAvgGrade(double avgGrade) {
        this.avgGrade = avgGrade;
    }
}
