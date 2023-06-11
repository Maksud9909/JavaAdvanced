package Collection.HashMap.hashcode1;

import java.util.HashMap;

public class HashCode2 {
    public static void main(String[] args) {
        HashMap<Integer,String> map = new HashMap<>();
        map.put(23,"maks");
        map.put(31,"anton");
        map.put(45,"rahmon");
        map.put(34,"abdu");
        map.put(67,"murad");
        System.out.println(map.get(45));

    }
}
