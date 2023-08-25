package Trash;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Employ implements Comparable<Employ>{
    public String name;
    public int age;
    public int course;

    public Employ(String name, int age, int course) {
        this.name = name;
        this.age = age;
        this.course = course;
    }

    @Override
    public String toString() {
        return "Employ{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", course=" + course +
                '}';
    }

    @Override
    public int compareTo(Employ emp) {
        return this.name.compareTo(emp.name);
    }

    public static void main(String[] args) {
        Employ employ1 = new Employ("Maksud",18,1);
        Employ employ2 = new Employ("Anton",20,2);
        Employ employ3 = new Employ("Chris",23,4);
        Employ employ4 = new Employ("Sanjar",45,4);
        List <Employ> employs = Arrays.asList(employ1,employ2,employ3,employ4);
        System.out.println(employs);
        Collections.sort(employs);
        System.out.println(employs);

    }
}
