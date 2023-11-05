package Reflection;

import Reflection.Employee;

import java.lang.reflect.Field;

public class Reflectipn3 {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException, IllegalAccessException {
        Employee employee = new Employee(17,"Maksud","IT");
        Class<?> clas = Class.forName("Reflection.Employee");
        Field field = clas.getDeclaredField("salary");
        field.setAccessible(true); // This is necessary for accessing private fields.
        int salary = (int) field.get(employee); // Cast it to int since it's an int field.
        System.out.println(salary);
    }
}
