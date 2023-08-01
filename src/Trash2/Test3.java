package Trash2;

import Trash.Student;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Test3 {
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

        String [] names = {"Maksud","Anton","Shohafiz","Sasha"};
        String result = Arrays.stream(names).reduce((a,e)-> {
            return a + " "+ e;
        }).get();
        System.out.println(result);

        System.out.println("-----");

        ArrayList <Integer> list = new ArrayList<>();

        List<Integer> result2 = list.stream().reduce((a,e)->{
            return a+e;
        }).stream().collect(Collectors.toList());
        System.out.println(result2 + " ");

        System.out.println("------");

       String string = new String("Maksud");
       String string1 = new String(" Rustamov");
       System.out.println(string1 + string);
        System.out.println(string.concat(string1));




    }
}


//List<Pupil> list = listPupil.stream().filter(pupil -> pupil.clas>=8).sorted(new Comparator<Pupil>() {
//            @Override
//            public int compare(Pupil o1, Pupil o2) {
//                int result = o1.clas - o2.clas;
//                return result;
//            }
//        }).collect(Collectors.toList());
//        list.forEach(pupil -> System.out.println(pupil));