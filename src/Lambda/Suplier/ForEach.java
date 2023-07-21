package Lambda.Suplier;

import java.util.ArrayList;
import java.util.List;

public class ForEach {
    public static void main(String[] args) {
//        List <String>list = List.of("Privet","kak dela","Norm","Poka");
//        for (String str:
//             list) {
//            System.out.println(str);
//        }
//        System.out.println("---");
//        list.forEach(str -> System.out.println(str));

        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(6);
        list.add(4);
        list.add(3);
        System.out.println(list);

        list.forEach(num ->{
            System.out.println(num);
            num*=2;
            System.out.println(num);
                }
        );
    }
}
