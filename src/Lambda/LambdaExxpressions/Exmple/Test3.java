package Lambda.LambdaExxpressions.Exmple;

import Generics.Game.Test;

import java.util.ArrayList;

public class Test3 {

    void checkLaptops (ArrayList <Laptop> ar, CheckLaptop checkLaptop){
        for(Laptop laptop: ar){
            if (checkLaptop.check(laptop)){
                System.out.println(laptop);
            }
        }
    }


    public static void main(String[] args) {
        Laptop laptop1 = new Laptop(8,7,"AOC");
        Laptop laptop2 = new Laptop(10,12,"MAC");
        Laptop laptop3 = new Laptop(4,10,"HP");
        Test3 test = new Test3();
        ArrayList <Laptop> laptops = new ArrayList<>();
        laptops.add(laptop1);
        laptops.add(laptop2);
        laptops.add(laptop3);
        test.checkLaptops(laptops, new CheckLaptop() {
            @Override
            public boolean check(Laptop laptop) {
                return laptop.monitor.equals("HP");
            }
        });

    }
}


class Laptop {
    int cores;
    int  gpu;
    String monitor;

    @Override
    public String toString() {
        return "Laptop{" +
                "cores=" + cores +
                ", gpu=" + gpu +
                ", monitor='" + monitor + '\'' +
                '}';
    }

    public Laptop(int cores, int gpu, String monitor) {
        this.cores = cores;
        this.gpu = gpu;
        this.monitor = monitor;
    }
}


interface CheckLaptop {
    boolean check(Laptop laptop);
}