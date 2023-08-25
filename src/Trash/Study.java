package Trash;

import com.sun.jdi.Value;
import org.jetbrains.annotations.NotNull;


import java.util.Objects;
import java.util.TreeMap;

public class Study implements Comparable<Study>{

    String name;
    int age;

    public Study(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Study{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public static void main(String[] args) {
        TreeMap<Study,Integer> hashMap = new TreeMap<>();
        Study study1 = new Study("Maksud",18);
        Study study2 = new Study("Sarvar",13);
        Study study3 = new Study("Saidaziz",19);
        hashMap.put(study1,10);
        hashMap.put(study2,20);
        hashMap.put(study1,12);





        hashMap.forEach((integer, study) -> System.out.println(integer+ " " + study));

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Study study = (Study) o;
        return age == study.age && Objects.equals(name, study.name);
    }

    @Override
    public int hashCode() {
        return 3;
    }

    @Override
    public int compareTo(@NotNull Study st1) {
        return st1.age-this.age;
    }
}
