package Collection.ArrayList1;


import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListEx {
    public static void main(String[] args) {
        ArrayList <String> arrayList1 = new ArrayList<>(3);
        arrayList1.add("Zaur");
        arrayList1.add("Ivan");
        arrayList1.add("Mariya");


        ArrayList <String> arrayList2 = new ArrayList<>(arrayList1);
        System.out.println(arrayList2);
        System.out.println(arrayList2==arrayList1);
    }
}
