package Stream.ForEach;

import java.util.Arrays;

public class Example {
    public static void main(String[] args) {
        int arr [] = {4,6,3,8,2};
        Arrays.stream(arr).forEach(Utils :: myMethod);

        int arr2 [] = {1,2,3,4,4,3,2,4,4,4,5,67,8,7,8};


       Arrays.stream(arr2).sorted().forEach(num-> System.out.print(num + " "));



    }
}

class Utils {
    public static void myMethod(int a){
        a = a + 5;
        System.out.println("Element =  " + a);
    }
}