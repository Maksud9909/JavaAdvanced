package Collection.HashMap.hashcode2;

import java.util.HashMap;
import java.util.Map;

public class Test1 {
    public static void main(String[] args) {
        Map <Integer,String> map = new HashMap<>(32,200);
        map.put(18,"Maksud");
        System.out.println(map);
    }
}
