import java.util.ArrayList;
import java.util.Objects;

public class Test1 {
    public static void main(String[] args) {
        ArrayList<Object> list = new ArrayList <>();
        list.add(false);
        list.add("fsd");

        System.out.println(gett(list));
    }

    public static <T> int gett (ArrayList<T> value){
      return value.size();
    }
}
