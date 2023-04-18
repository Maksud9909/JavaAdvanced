package Generics.WildCards;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Test3 {
    public static void main(String[] args) {

        ArrayList<Number> arrayList = new ArrayList<>();
        arrayList.add(13.5);
        arrayList.add(456.6);
        arrayList.add(1345.4);
        System.out.println(summ(arrayList));



    }

    static void showListInfo(List<?> list) {
        System.out.println("Here is the elements " + list);
    }

    public static double summ(ArrayList<? extends Number> arrayList) {
        double result = 0;
        for (Number n :
                arrayList) {
            result += n.doubleValue(); // он превращает весь результат в double
        }
        return result;
    }
}