package Delete1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Vector;

public class Test1 {
    public static void main(String[] args) {
        Person person = new Employee();
        System.out.println(person.say());
        List<Integer>integerList = new ArrayList<>();
        integerList.add(123);
        integerList.add(23);
        integerList.add(23455);
        System.out.println(integerList.subList(0,2));

    }






}


class Person{
    char sex;
    int age;
    public  String say(){
        return "Person";
    }
}

class Employee extends Person{
    String work;
    int experieance;
    public  String say(){
        return "Employee";
    }
}

class Business3 extends Person{
    String work;
    int money;
    public String say(){
        return "Business";
    }
}