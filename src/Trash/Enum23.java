package Trash;

public class Enum23 {

}


enum Courses {
    Economics,EcoFin,Finance,BIS,BA;
}

class Course{
    Courses courses;
    public Course(Courses courses){
        this.courses = courses;
    }
    void courseInfo(){
        switch (courses){
            case Economics:
            case EcoFin:
            case Finance:
                System.out.println("It is Economics or Finance");
                break;
            case BIS:
                System.out.println("Computer science");
                break;
            case BA:
                System.out.println("Business Mangement");
                break;
        }
    }

    public static void main(String[] args) {
        Course course1 = new Course(Courses.EcoFin);
        course1.courseInfo();
    }
}