package Trash;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test {



    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(3);
        list.add(5);
        list.add(6);
        list.add(9);
        list.forEach(nums -> {
            System.out.println(nums);
            System.out.println("-----");
            System.out.println(nums*2);
        });


    }
}