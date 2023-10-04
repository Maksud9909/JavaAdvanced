package Files.Serialization;

import Files.Serialization.Car;

import java.io.Serializable;

public class Student implements Serializable {
    static final long serialVersionUID = 2;
    String name;
    String surname;
    String department;
    transient double salary;
    Car car;

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", department='" + department + '\'' +
                ", salary=" + salary +
                ", car=" + car +
                '}';
    }

    public Student(String name, String surname, String department, double salary, Car car) {
        this.name = name;
        this.surname = surname;
        this.department = department;
        this.salary = salary;
        this.car = car;
    }
}
