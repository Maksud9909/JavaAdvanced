package Trash;

import java.lang.reflect.Field;
import java.util.Arrays;

public class Reflection {


    public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException {
        Class aClass = Class.forName("Comparation.Employee.Employee");
        Field [] fields = aClass.getDeclaredFields();
        Arrays.stream(fields).forEach(field -> System.out.println(field.getName()));

    }
}