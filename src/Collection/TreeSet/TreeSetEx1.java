package Collection.TreeSet;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetEx1 {
    public static void main(String[] args) {
        Set<Integer> treeSet = new TreeSet<>();
        treeSet.add(3);
        treeSet.add(2);
        treeSet.add(5);
        treeSet.add(10);
        treeSet.add(8);
        treeSet.remove(10);
        System.out.println(treeSet);

    }
}
