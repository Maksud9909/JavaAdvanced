package Trash;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TypedArrayList <V> {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add("Maksud");
        list.add(12);
        System.out.println(list);

    }

    public static void show (List<?> list){
        System.out.println("Elements " + list);
    }
}