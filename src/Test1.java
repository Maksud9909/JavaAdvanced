import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Test1 {
    public static void main(String[] args) {
        List <Integer> list = new ArrayList<>();
        list.add(170);
        list.add(18);
        show(list);
    }
    static void show (List<? extends Number> list){
        System.out.println("Elements " + list);
    }

}
