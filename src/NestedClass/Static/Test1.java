package NestedClass.Static;

import java.nio.file.Watchable;

public class Test1 {
    public static void main(String[] args) {
        Laptop laptop1 = new Laptop("Apple");
        Watch watch1 = new Watch("Rolex");
        System.out.println(watch1);
        Test1 test1 = new Test1("Maksud","Rustamov",watch1,laptop1);
        System.out.println(test1);



        Test1.Laptop laptop2 = new Laptop("HP");
        System.out.println(laptop2);



    }
    String name;
    String surname;

    Watch watch;
    Laptop laptop;

    public Test1(String name, String surname, Watch watch, Laptop laptop) {
        this.name = name;
        this.surname = surname;
        this.watch = watch;
        this.laptop = laptop;
    }

    @Override
    public String toString() {
        return "Pupil{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", watch=" + watch +
                ", laptop=" + laptop +
                '}';
    }

    public static class Watch {
        String brand;

        public Watch(String brand) {
            this.brand = brand;
        }

        @Override
        public String toString() {
            return "Watch{" +
                    "brand='" + brand + '\'' +
                    '}';
        }
    }
    public static class Laptop {
        String model;

        public Laptop(String model) {
            this.model = model;
        }

        @Override
        public String toString() {
            return "Laptop{" +
                    "model='" + model + '\'' +
                    '}';
        }
    }



}
