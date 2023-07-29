package Collection.PriorityQueue;

import org.jetbrains.annotations.NotNull;

import java.util.Objects;

public class Student2 implements Comparable<Student2>{
    String name;
    String surname;
    int course;

    public Student2(String name, String surname, int course) {
        this.name = name;
        this.surname = surname;
        this.course = course;
    }

    @Override
    public String toString() {
        return "Trash.Student{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", course=" + course +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student2 student = (Student2) o;
        return course == student.course;
    }

    @Override
    public int hashCode() {
        return Objects.hash(course * 6);
    }

    @Override
    public int compareTo(@NotNull Student2 another) {
        int result = this.course - another.course;
        return result;
    }
}
