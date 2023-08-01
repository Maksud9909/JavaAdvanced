package Stream.FlatMap;

import Stream.Student;

import javax.sql.rowset.spi.SyncResolver;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FlatMap {
    public static void main(String[] args) {
        Stream.Student student1 = new Stream.Student("Maksud",'m',18,1,8.5);
        Stream.Student student2 = new Stream.Student("Madina",'f',17,1,9.0);
        Stream.Student student3 = new Stream.Student("Muslima",'f',21,3,7.6);
        Stream.Student student4 = new Stream.Student("Anton",'m',23,5,9.1);
        Stream.Student student5 = new Stream.Student("Firdavs",'m',19,1,8.3);
        List<Student> list = new ArrayList<>();
        list.add(student1);
        list.add(student2);
        list.add(student4);
        list.add(student5);
        list.add(student3);

        Faculty faculty1 = new Faculty("Economics");
        Faculty faculty2 = new Faculty("Applied Math");
        faculty1.addStudentToFaculty(student1);
        faculty1.addStudentToFaculty(student2);
        faculty1.addStudentToFaculty(student3);
        faculty2.addStudentToFaculty(student4);
        faculty2.addStudentToFaculty(student5);

        List<Faculty> facultyList = new ArrayList<>();
        facultyList.add(faculty1);
        facultyList.add(faculty2);

        facultyList.stream().flatMap(faculty -> faculty.getStudentList().stream()).
                forEach(student -> System.out.println(student.getName()));

    }
}


class Faculty {
    String name;
    List<Student> studentList;

    public Faculty(String name) {
        this.name = name;
        studentList = new ArrayList<>();
    }

    public List<Student> getStudentList() {
        return studentList;
    }
    public void addStudentToFaculty (Student student){
        studentList.add(student);
    }
}