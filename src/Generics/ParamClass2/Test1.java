package Generics.ParamClass2;

import java.sql.Array;
import java.util.ArrayList;

public class Test1 {
    public static void main(String[] args) {
        int[] arrays = {};
        arrays[0] = 1;
        arrays[1] = 2;
        ArrayList <Integer> list = new ArrayList<>();
        list.add(1);
        list.add(1);
        System.out.println(list);
        for (int arr:
             arrays) {
            System.out.print(arr + ",");
        }

    }
}
