package Stream.CollectTerminal;



import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GrouppingBy {
    public static void main(String[] args) {
        Pupil pupil1 = new Pupil("Maksud",50,11,"Math");
        Pupil pupil2 = new Pupil("Anton",50,4,"Physic");
        Pupil pupil3 = new Pupil("Lenya",234,4,"Math");
        Pupil pupil4 = new Pupil("Oleg",13,9,"Russian");
        Pupil pupil5 = new Pupil("Sasha",1,8,"English");
        ArrayList<Pupil> listPupil = new ArrayList<>();
        listPupil.add(pupil1);
        listPupil.add(pupil2);
        listPupil.add(pupil3);
        listPupil.add(pupil4);
        listPupil.add(pupil5);

        Map<Integer,List<Pupil>> result = listPupil.stream().map(pupil -> {
            pupil.setName(pupil.getName().toUpperCase());
            return pupil;
        }).collect(Collectors.groupingBy(pupil -> pupil.getGroup()));
        result.forEach((integer, pupils) -> {
            System.out.println(integer.toString() + " " + pupils);

        });
    }
}
