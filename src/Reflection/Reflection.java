package Reflection;


import java.lang.reflect.Constructor;
import java.util.Arrays;


public class Reflection {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException, NoSuchMethodException {
        Class<?> employeeClass1 = Class.forName("Reflection.Employee");


        Constructor constructor = employeeClass1.getConstructor(int.class,String.class,String.class);
        System.out.println(Arrays.toString(constructor.getParameters()));
        Constructor [] constructors = employeeClass1.getConstructors();
        Arrays.stream(constructors).forEach(constructor1 -> System.out.println(Arrays.toString(constructor1.getParameters())));
    }
}

