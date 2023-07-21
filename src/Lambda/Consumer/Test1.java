package Lambda.Consumer;

import Lambda.Suplier.Car;

import java.util.ArrayList;
import java.util.function.Consumer;

import static Lambda.Suplier.Test1.createThreeCars;

public class Test1 {
    public static void changeCar(Car car, Consumer<Car> consumer){
        consumer.accept(car);
    }

    public static void main(String[] args) {
        ArrayList<Car> list = new ArrayList<>();

        Car car2 = new Car("Lacceti","Black",2);
        System.out.println(car2);
        changeCar(car2, new Consumer<Car>() {
            @Override
            public void accept(Car car) {
                car.color = "Orange";
                car.model = "Labo";
                car.engine = 3;
            }
        });
        System.out.println(car2);
    }
}



//ArrayList<Car> listCars = createThreeCars(() ->
//                new Car("Chevrolet tracker","Black",1));
//        changeCar(listCars.get(0),car -> {
//            car.color = "Yellow";
//            car.model = "Lacceti";
//            car.engine = 1.6;
//        });
//        System.out.println(listCars);
