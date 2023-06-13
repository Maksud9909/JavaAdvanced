package Collection.HashMap.hashcode1;

import java.util.*;

public class HashCode1 {
    public static void main(String[] args) {
        Map<Student,Integer> map = new HashMap<>();
        Student st1 = new Student("Maksud","Rustamov",1);
        Student st2 = new Student("Murad","Rustamov",3);
        Student st3 = new Student("Nafisa","Jumaeva",5);
        map.put(st1,456);
        map.put(st2,234);
        map.put(st3,245);
        System.out.println(map);

        Student st4 = new Student("Maksud","Rustamov",1);
        Boolean result = map.containsKey(st4);
        System.out.println(result);
        System.out.println(st1.hashCode());
        System.out.println(st4.hashCode());

        System.out.println("-------");


        for (Map.Entry<Student,Integer> entry: map.entrySet()){
            System.out.println(entry.getKey() + ":" + entry.getValue());
        }


    }

}

final class Student {
     final String name;
    final String surname;
     final int course;

    public Student(String name, String surname, int course) {
        this.name = name;
        this.surname = surname;
        this.course = course;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", course=" + course +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return course == student.course && Objects.equals(name, student.name) && Objects.equals(surname, student.surname);
    }

    @Override
    public int hashCode() {
        return name.length() * 7 + surname.length() * 134 + course * 53;
    }
    // hashcode - это когда результаты превращаются в int, чтобы они не были одинаковыми
    // затем эти элементы умножаются и получаются разные значения, чем больше цифры, тем меньше будет совпадений
}
