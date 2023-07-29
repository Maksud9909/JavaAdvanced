package Stream.Reduce;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Reduce {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(5);
        list.add(8);
        list.add(5);
        list.add(2);
        int result = list.stream().reduce(1,(accumulator,num)->accumulator*num);
        System.out.println(result);
        // 2 5 8 5 2
        // accum - 2
        // num - 5

        List<String> lis = new ArrayList<>();
        lis.add("Ok");
        lis.add("Privet");
        lis.add("Kak dela");
        lis.add("Otlichno");
        System.out.println(lis);
        String resultt = lis.stream().reduce((a,e)->a+ " " + e).get();
        System.out.println(resultt);




    }
}
