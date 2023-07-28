package Trash;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Test3 {
    public static void main(String[] args) {

        Plus plus = (int a,int b) -> System.out.println(a + b);
        plus.minus(12,12);


}
@FunctionalInterface
 interface Plus {
      void minus(int a, int b);
}}