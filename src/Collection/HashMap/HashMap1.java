package Collection.HashMap;

import java.util.HashMap;
import java.util.Map;

public class HashMap1 {
    public static void main(String[] args) {
        HashMap<Integer,String> pasport = new HashMap<>();
        pasport.put(123,"Maksud Rustamov");
        pasport.put(324,"Pirt Shojalilov");


        HashMap<Integer,String> passport2 = new HashMap<>();
        passport2.put(153,"Donty Sobirjonov");
        passport2.put(898,"Firdavs Azimov");



        pasport.putAll(passport2);
        System.out.println(pasport);








    }

}
