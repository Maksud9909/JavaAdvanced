import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Test1 {
    public static void main(String[] args) {
        List <Integer> list = Arrays.asList(1,2,3,4,5,56,7,78,8,98,89,8,7,7,7,7,57,5,67);
        Collections.sort(list);
        System.out.println(list);
        System.out.println("Size " + list.size());
       Integer result = Collections.binarySearch(list,57);
        System.out.println(result);
    }

}
