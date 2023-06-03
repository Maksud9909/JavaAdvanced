import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Test1 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,8,5,4,4,5,3,3,5,3,5,5,5,5);
        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);
        int result = Collections.binarySearch(list,4);
        System.out.println(result);
    }

}
