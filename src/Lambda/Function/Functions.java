package Lambda.Function;

import Lambda.LambdaExxpressions.Student;

import java.util.ArrayList;
import java.util.function.Function;

public class Functions {
    public static void main(String[] args) {
        Function<Double, Long> function = d -> Math.round(d);
        System.out.println(function.apply(13.3));


        Student student11 = new Student("Maksud", 'm', 18, 1, 4.5);
        Student student22 = new Student("Umar", 'm', 17, 2, 5);
        Student student33 = new Student("Murad", 'm', 19, 3, 4);
        Student student44 = new Student("Hamidullo", 'm', 24, 4, 4.3);
        Student student55 = new Student("Madina", 'f', 17, 1, 5);

        ArrayList<Student> studentList = new ArrayList<>();
        studentList.add(student11);
        studentList.add(student22);
        studentList.add(student33);
        studentList.add(student44);
        studentList.add(student55);

        double smth = avgOfSmth(studentList, student -> (double)student.age);
        System.out.println(smth);

    }
    private static double avgOfSmth (ArrayList<Student> list, Function<Student,Double> function){
        double result = 0;
        for (Student st:list) {
            result += function.apply(st);
        }
        result = result / list.size();
        return result;
    }
}
