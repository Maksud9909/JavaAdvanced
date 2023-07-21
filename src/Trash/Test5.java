package Trash;

import java.util.ArrayList;

public class Test5 <T>{
    T numberOfTheCar;
    T modelOfCar;

    public Test5(T numberOfTheCar, T modelOfCar) {
        this.numberOfTheCar = numberOfTheCar;
        this.modelOfCar = modelOfCar;
    }

    @Override
    public String toString() {
        return "Test5{" +
                "numberOfTheCar=" + numberOfTheCar +
                ", modelOfCar=" + modelOfCar +
                '}';
    }

    public static void main(String[] args) {
        Test5<String> test5 = new Test5<>("Maksd","sdf");
        System.out.println(test5);

        ArrayList <String> list = new ArrayList<>();
        list.add("Maksud");
        ArrayList<String> list1 = new ArrayList<>(list);
        System.out.println(list1.equals(list));

    }
}
