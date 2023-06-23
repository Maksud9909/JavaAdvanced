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

class Student {
    String name;
    String surname;
    int age;

    public Student(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return age == student.age && Objects.equals(name, student.name) && Objects.equals(surname, student.surname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name.length() * 7, surname.length() * 7, age *7);
    }
}
