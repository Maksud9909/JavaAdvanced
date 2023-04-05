package Generics.ParamMethod1;

import java.util.ArrayList;

public class ParameterizedMethod {
    public static void main(String[] args) {
        ArrayList <String>list1 = new ArrayList<>();
        list1.add("maksud");
        list1.add("murad");
        list1.add("umar");
        String a = GenMethod.getSecondElement(list1);
        System.out.println(a);


    }

}

class GenMethod {
    public static <T> T getSecondElement(ArrayList<T> arrayList){
        return arrayList.get(1);
    }
}