package Delete1;

import java.util.Arrays;
import java.util.Collections;

public class Test3 {
    public static void main(String[] args) {
        int arr [] = {-3,5,2,45,-6,3,5,3,5354,47,435,-68};
        System.out.println(Arrays.toString(arr));
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        int result = Arrays.binarySearch(arr,-6);
        System.out.println(result);
    }

}
