package Lambda.Suplier;

import java.util.ArrayList;
import java.util.function.Supplier;

public class Test1 {
public static ArrayList<Car> createThreeCars (Supplier<Car> supplier){
    ArrayList <Car> list = new ArrayList<>();
    for (int i = 0; i < 3; i++) {
        list.add(supplier.get());
    }
    return list;
}

    public static void main(String[] args) {
        ArrayList<Car> list = createThreeCars(() ->
                new Car("Chevrolet tracker","Black",1));
        System.out.println(list);
    }
}

