package Collection.ArrayList1.Part4;

import java.util.ArrayList;
import java.util.List;
import java.util.SimpleTimeZone;

public class ArrayListMethods5 {
    public static void main(String[] args) {
        ArrayList<String> arrayList1 = new ArrayList<> ();
        arrayList1.add ("Zaur");
        arrayList1.add ("Ivan");
        arrayList1.add ("Mariya");
        arrayList1.add ("Kolya");
        arrayList1.add("Elena");
        String[] array = arrayList1.toArray(new String[0]);
//        for (Object obj:
//             array) {
//            System.out.println(obj);
//        }

//        List<Integer> list = List.of(1,2,4);
//        System.out.println(list);


        List<String> stringList = List.copyOf(arrayList1);
        System.out.println(stringList);

        List<String> list = List.of("maksud","anton","abdu");
        list.add("kk");
        System.out.println(list);











    }
}
