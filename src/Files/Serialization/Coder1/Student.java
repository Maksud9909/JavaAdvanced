package Files.Serialization.Coder1;

import java.io.Serializable;

public class Student implements Serializable {
    String name;
    String department;
    int age;
    double salary;

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", department='" + department + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                '}';
    }

    public Student(String name, String department, int age, double salary) {
        this.name = name;
        this.department = department;
        this.age = age;
        this.salary = salary;
    }
}
