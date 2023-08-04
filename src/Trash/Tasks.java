package Trash;


import java.util.*;
import java.util.stream.Collectors;


public class Tasks {
    public static void main(String[] args) {
        Studentt student1 =  new Studentt("Murod",20,4);
        Studentt student2 =  new Studentt("Jessi",27,3.5);
        Studentt student3 =  new Studentt("Xasan",32,4.6);
        Studentt student4 =  new Studentt("Grisha",18,5);
        Studentt student5 =  new Studentt("Alisher",23,4.1);
        Studentt student6 =  new Studentt("Anton",45,4.3);
        List<Studentt> list = Arrays.asList(student1,student2,student3,student6,student4,student5);



        // срдений возраст
//        int result = list.stream().mapToInt(Studentt::getAge).sum();
////        result = result / list.size();



        // наивысший gpa
//        Optional<Studentt> result = list.stream().max(new Comparator<Studentt>() {
//            @Override
//            public int compare(Studentt o1, Studentt o2) {
//                return (int) (o1.getGpa() - o2.getGpa());
//            }
//        });



        // студенты которым больше 20 и сортировка по алфавиту
//        List<Studentt> result = list.stream().filter(studentt -> {
//            return studentt.getAge() > 20;
//        }).sorted(new Comparator<Studentt>() {
//            @Override
//            public int compare(Studentt st1, Studentt st2) {
//                return st1.getName().compareTo(st2.getName());
//            }
//        }).collect(Collectors.toList());
//        System.out.println(result);



        // Проверить, есть ли хотя бы один студент с баллом (gpa) больше 4.5.
//        list.stream().filter(student -> student.getGpa() > 4.5 ).forEach(studentt -> System.out.println(studentt));




        // * Посчитать количество студентов, чьи имена начинаются на букву "А".
        Map<Integer,List<Studentt>> map= list.stream().filter(student -> {
            if (student.getName().startsWith("A")){
                return true;
            }else {
                return false;
            }
        } ).collect(Collectors.groupingBy(studentt -> studentt.getAge()));
        System.out.println(map);







    }
}

class Studentt {
    String name;
    int age;
    double gpa;

    public Studentt(String name, int age, double gpa) {
        this.name = name;
        this.age = age;
        this.gpa = gpa;
    }

    @Override
    public String toString() {
        return "Studentt{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gpa=" + gpa +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }
}
