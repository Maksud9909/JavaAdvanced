package Collection.ArrayList1.Part2;

import java.util.ArrayList;

public class Test1 {
    public static void main(String[] args) {
        ArrayList <String> arrayList1 = new ArrayList<>();
        arrayList1.add("Maksud");
        arrayList1.add("Anton");
        arrayList1.add("Bob");
        ArrayList <String> arrayList2 = new ArrayList<>();
        arrayList2.add("Gilya");
        arrayList2.add("Grisha");
        arrayList2.add("Nafisa");
        arrayList1.addAll(arrayList2);
        System.out.println(arrayList1.indexOf("Anton"));
    }
}
