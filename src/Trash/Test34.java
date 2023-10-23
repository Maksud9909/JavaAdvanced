package Trash;


public class Test34 {
    static void studentInfo(Student student) {
        System.out.printf("%03d \t %-12s \t %-12s \t %d \n",
                student.id, student.name, student.direction, student.age);
    }

    public static void main(String[] args) {
         Student student1 = new Student( 1234,"Madina","Rajabova",1400);
         Student student2 = new Student( 2342,"Nigina","Rustaova",2222);
         Student student3 = new Student( 5433,"Feruza","Karimova",2345);


        studentInfo(student1);
        studentInfo(student2);
        studentInfo(student3);

    }

}

class Student {
    int id;
    String name;
    String direction;
    int age;

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", direction='" + direction + '\'' +
                ", age=" + age +
                '}';
    }

    public Student(int id,String name, String direction, int age) {
        this.id = id;
        this.name = name;
        this.direction = direction;
        this.age = age;
    }
}