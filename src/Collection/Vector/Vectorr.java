package Collection.Vector;

import java.util.Vector;

public class Vectorr {
    public static void main(String[] args) {
        Vector <String> vector = new Vector<>();
        vector.add("Maksud");
        vector.add("Misha");
        vector.add("Oleg");
        System.out.println(vector.firstElement());
        System.out.println(vector.lastElement());
        System.out.println(vector.remove(1));
    }
}
