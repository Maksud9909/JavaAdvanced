package Stream.Sorted;

import java.util.Arrays;

public class Sorted {
    public static void main(String[] args) {
        int array [] = {1,2,4,5,34,5,23,54,86,0,3,434};
        array = Arrays.stream(array).sorted().toArray();
        System.out.println(Arrays.toString(array));
    }
}
