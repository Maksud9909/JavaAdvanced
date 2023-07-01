package Collection.ArrayList1.ArrayList;


import java.util.ArrayList;

public class ArrayListMethods {
    public static void main(String[] args) {
        ArrayList <String> arrayList1 = new ArrayList<>(3);
        arrayList1.add("Zaur");
        arrayList1.add("Ivan");
        arrayList1.add("Mariya");
        arrayList1.add("Maksud");
        for (String l:
             arrayList1) {
            System.out.println(l);
        }
        ArrayList <String> arrayList2 = new ArrayList<>(arrayList1);
        System.out.println(arrayList2);
        System.out.println(arrayList2==arrayList1);
    }
}
