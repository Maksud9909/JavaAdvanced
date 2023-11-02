package Trash;

import java.lang.reflect.Field;

public class Reflection {


    public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException {
        Class aClass = Class.forName("Comparation.Employee.Employee");
        Field field = aClass.getField("name");
        System.out.println(field.getType());
    }
}