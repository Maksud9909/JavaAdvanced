package Collection.LinkedList;

import java.util.LinkedList;

public class linkedlist {
    public static void main(String[] args) {
        Student2 student1 = new Student2("Maksud",1);
        Student2 student2 = new Student2("Sevara",3);
        Student2 student3 = new Student2("Sherzod",4);
        Student2 student4 = new Student2("Nafisa",2);
        Student2 student5 = new Student2("Murad",2);


        LinkedList<Student2> linkedList = new LinkedList<>();
        linkedList.add(student1);
        linkedList.add(student2);
        linkedList.add(student3);
        linkedList.add(student4);
        linkedList.add(student5);

        System.out.println("Linked List = " + linkedList);

        Student2 student6 = new Student2("Umar",4);
        Student2 student7 = new Student2("Anton",3);
        linkedList.add(0,student6);
        linkedList.remove(1);
        System.out.println("Linked List = " + linkedList);





    }
}


class Student2 {
    String name;
    int course;

    public Student2(String name, int course) {
        this.name = name;
        this.course = course;
    }

    @Override
    public String  toString() {
        return "Student2{" +
                "name='" + name + '\'' +
                ", course=" + course +
                '}';
    }
}