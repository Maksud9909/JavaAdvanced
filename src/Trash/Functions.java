package Trash;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class Functions {
    public static void main(String[] args) {
        Chair chair1 = new Chair("Lev",4,100);
        Chair chair2 = new Chair("Ofis",5,150);
        Chair chair3 = new Chair("Taburetka",2,20);
        List<Chair> list = new ArrayList<>();
        list.add(chair1);
        list.add(chair2);
        list.add(chair3);
        System.out.println(avgCostOfChairs(list, chair -> chair.cost));

    }
    public static Integer avgCostOfChairs (List<Chair> list, Function<Chair,Integer> function){
        Integer result = 0;
        for (Chair ch: list) {
            result += function.apply(ch);
        }
        result = result / list.size();
        return result;
    }

}
