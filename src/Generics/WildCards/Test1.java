package Generics.WildCards;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Test1 {
    public static void main(String[] args) {
        List <Number> list = new ArrayList<>();
        list.add(334.4);
        list.add(345.3);
        list.add(567.4);

        System.out.println(summ(list));


    }

    public static void showListInfo(List<?> list){
        System.out.println(list.toString());
    }
    static double summ (List<? extends Number> arrayList){
        double result = 0;
        for (Number n :
             arrayList) {
            result += n.doubleValue();
        }
        return result;
    }


}
