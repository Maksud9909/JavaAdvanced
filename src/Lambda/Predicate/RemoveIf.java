package Lambda.Predicate;

import java.util.ArrayList;

public class RemoveIf {
    public static void main(String[] args) {
        ArrayList <String> arrayList = new ArrayList<>();
        arrayList.add("Bobur");
        arrayList.add("Sevara");
        arrayList.add("Musechka");
        arrayList.add("Kamola");
        arrayList.add("Humayun");
        arrayList.removeIf(element -> element.length()<7);
        System.out.println(arrayList);
    }
}
