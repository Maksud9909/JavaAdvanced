package Collection.HashMap.hashcode1;

import java.util.Objects;

public final class Student implements Comparable<Student>{
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
        Student student = (Student) o;
        return course == student.course && Objects.equals(name, student.name) && Objects.equals(surname, student.surname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, course);
    }

    @Override
    public int compareTo(Student anotherStudent) {
        int result = 0;
        result = this.name.compareTo(anotherStudent.name);
        if (result == 0){
            result = this.surname.compareTo(anotherStudent.surname);
            if (result == 0){
                result = this.course - anotherStudent.course;
            }
        }
        return result;
    }

    // hashcode - это когда результаты превращаются в int, чтобы они не были одинаковыми
    // затем эти элементы умножаются и получаются разные значения, чем больше цифры, тем меньше будет совпадений
}
