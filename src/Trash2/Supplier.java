package Trash2;

import java.util.function.Consumer;

public class Supplier {
    public static void changPupil(Pupil pupil, Consumer<Pupil> consumer){
        consumer.accept(pupil);
    }
    public static void main(String[] args) {
        Pupil pupil1 = new Pupil("Maksud",50,11,"Math");
        Pupil pupil2 = new Pupil("Anton",50,5,"Physic");
        Pupil pupil3 = new Pupil("Lenya",234,4,"Math");
        Pupil pupil4 = new Pupil("Oleg",13,9,"Russian");
        Pupil pupil5 = new Pupil("Sasha",1,8,"English");
        System.out.println(pupil1);
        changPupil(pupil1,pupil -> {
            pupil.clas = 1;
            pupil.name = "Antosha";
        });
        System.out.println(pupil1);
    }
}
