package Stream.ForEach;

import java.util.Arrays;

public class ForEach {
    public static void main(String[] args) {
        int arr [] = {4,6,3,8,2};
        Arrays.stream(arr).forEach(numbers -> {
            numbers *= 2;
            System.out.print(numbers + " ");
        });

    }
}
