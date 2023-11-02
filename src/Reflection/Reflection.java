package Reflection;

import javax.swing.*;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Arrays;

public class Reflection {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException, NoSuchMethodException {
        Class employeeClass1 = Class.forName("Reflection.Employee");


        Method method = employeeClass1.getMethod("increaseSalary");
        System.out.println(method);
    }
}

class Employee{
    public int id;
    public String name;
    public String department;
    private int salary;

    public Employee() {
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public Employee(int id, String name, String department) {
        this.id = id;
        this.name = name;
        this.department = department;
    }

    public Employee(int id, String name, String department, int salary) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    public void changeDepartment(String newDepartment){
        department = newDepartment;
        System.out.println("New department is " + department);
    }

    public void increaseSalary(){
        salary*=2;
    }
}
