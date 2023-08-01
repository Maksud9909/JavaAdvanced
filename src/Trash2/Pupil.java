package Trash2;

import Lambda.LambdaExxpressions.Student;
import com.sun.security.jgss.GSSUtil;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Pupil {

    public String name;
    public int school;
    public int clas;
    public String direction;

    public Pupil(String name, int school, int clas, String direction) {
        this.name = name;
        this.school = school;
        this.clas = clas;
        this.direction = direction;
    }

    @Override
    public String toString() {
        return "Pupil{" +
                "name='" + name + '\'' +
                ", school=" + school +
                ", clas=" + clas +
                ", direction='" + direction + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSchool() {
        return school;
    }

    public void setSchool(int school) {
        this.school = school;
    }

    public int getClas() {
        return clas;
    }

    public void setClas(int clas) {
        this.clas = clas;
    }

    public String getDirection() {
        return direction;
    }

    public void setDirection(String direction) {
        this.direction = direction;
    }
}

class Test {
    public  void testPupil (ArrayList<Pupil> list, Predicate<Pupil> predicate){
        for (Pupil p:list) {
            if (predicate.test(p)){
                System.out.println(p);
            }
        }
    }
    public static void main(String[] args) {
        Pupil pupil1 = new Pupil("Maksud",50,11,"Math");
        Pupil pupil2 = new Pupil("Anton",50,5,"Physic");
        Pupil pupil3 = new Pupil("Lenya",234,4,"Math");
        Pupil pupil4 = new Pupil("Oleg",13,9,"Russian");
        Pupil pupil5 = new Pupil("Sasha",1,8,"English");
        ArrayList<Pupil> listPupil = new ArrayList<>();
        listPupil.add(pupil1);
        listPupil.add(pupil2);
        listPupil.add(pupil3);
        listPupil.add(pupil4);
        listPupil.add(pupil5);
        listPupil.forEach(pupil -> System.out.println(pupil));
        Test test = new Test();
        test.testPupil( listPupil, pupil -> pupil.clas>=8);
    }
}