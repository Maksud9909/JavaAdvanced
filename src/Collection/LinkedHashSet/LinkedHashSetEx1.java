package Collection.LinkedHashSet;

import java.util.LinkedHashSet;


public class LinkedHashSetEx1 {
    public static void main(String[] args) {
        LinkedHashSet<Integer> hashSet = new LinkedHashSet<>(16,0.75f);
        hashSet.add(18);
        hashSet.add(19);
        hashSet.add(76);
        hashSet.add(1349);
        System.out.println(hashSet);
        System.out.println(hashSet.remove(19));
        System.out.println(hashSet);


        System.out.println(hashSet.contains(1349));


    }
}
