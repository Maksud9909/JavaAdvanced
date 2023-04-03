package Comparation.Employee;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


class Test1 {
    public static void main(String[] args) {
        List<Employee> list = new ArrayList<>();
        Employee employee1 = new Employee(3,"Maksud","Rustamov",768);
        Employee employee2 = new Employee(89,"Anton","Rustamov",32);
        Employee employee3 = new Employee(45,"Doty","Rustamov",7398);
        list.add(employee1);
        list.add(employee2);
        list.add(employee3);
        System.out.println("Before Sorting");
        System.out.println(list);
        System.out.println("After Sorting");
        Collections.sort(list,new NameComparator());
        System.out.println(list);
        System.out.println();
    }
}

public class Employee implements Comparable <Employee>{
    int id;
    String name;
    String surname;
    int salary;

    public Employee(int id, String name, String surname, int salary) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", salary=" + salary +
                '}';
    }

    @Override
    public int compareTo(Employee anotherEmp) {
        return this.id - anotherEmp.id;
    }
}


class NameComparator implements Comparator<Employee>{

    @Override
    public int compare(Employee emp1, Employee emp2) {
        return emp1.name.compareTo(emp2.name);
    }
}

class SalaryComparator implements Comparator<Employee>{


    @Override
    public int compare(Employee emp1, Employee emp2) {
        return emp1.salary - emp2.salary;
    }
}