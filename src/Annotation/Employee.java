package Annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

public class Employee {
    public static void main(String[] args) {

    }
    String name;
    double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }
    @MyAnnotation
    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
    public void increaseSalary(){
        salary*=2;
    }
}



@Target({ElementType.METHOD,ElementType.TYPE})
@interface MyAnnotation{

}















