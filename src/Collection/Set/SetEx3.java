package Collection.Set;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class SetEx3 {
    public static void main(String[] args) {
        Set<Student> set = new HashSet<>();
        Student student1 = new Student("Maksud","Rustamov",18);
        Student student2 = new Student("Murad","Rustamov",18);
        Student student3 = new Student("Anton","Rustamov",18);
        set.add(student1);
        set.add(student2);
        set.add(student3);
        System.out.println(set);

    }
}

