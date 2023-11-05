package Reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Reflection2 {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException,
            InvocationTargetException, InstantiationException,
            IllegalAccessException {
        Class clas = Class.forName("Reflection.Employee");
        Constructor constructor = clas.getConstructor(int.class,String.class,String.class);
        Object obj = constructor.newInstance(17,"maksud","IT");
        System.out.println(obj);
        Method method = clas.getMethod("setSalary", int.class);
        method.invoke(obj,5000);
        System.out.println(obj);
    }
}
