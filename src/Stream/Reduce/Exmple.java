package Stream.Reduce;

import java.util.Arrays;
import java.util.List;

public class Exmple {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(2,45,7,3,6,3,6,4,6,56);
        System.out.println(list);
        Integer result  = list.stream().reduce((a, e)-> a-e).get();
        System.out.println(result);

    }
}
