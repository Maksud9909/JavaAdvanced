package Generics.SubTyping;

import java.util.ArrayList;
import java.util.List;

public class Test2 {


    public static void main(String[] args) {
        Car car = new Car(23);
        System.out.println(car);

    }
//    public void abc(Car <String> car){
//        String s = car.getNumberOfTheCar();
//    }
    public void abc(Car <Integer> car){
        int s = car.getNumberOfTheCar();
    }
    // abc(Car car)


}

class Car <T>{
    T numberOfTheCar;

    public Car(T numberOfTheCar) {
        this.numberOfTheCar = numberOfTheCar;
    }

    public T getNumberOfTheCar() {
        return numberOfTheCar;
    }

    public void setNumberOfTheCar(T numberOfTheCar) {
        this.numberOfTheCar = numberOfTheCar;
    }

    @Override
    public String toString() {
        return "Car{" +
                "numberOfTheCar=" + numberOfTheCar +
                '}';
    }

}
interface i1{}
interface i2{}