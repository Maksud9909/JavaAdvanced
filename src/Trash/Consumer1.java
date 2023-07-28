package Trash;

import java.util.function.Consumer;

public class Consumer1 {
    public static void changeChair(Chair chair, Consumer<Chair> chairConsumer){
        chairConsumer.accept(chair);
    }

    public static void main(String[] args) {
        Chair chair1 = new Chair("Lev",4,100);
        Chair chair2 = new Chair("Ofis",5,150);
        Chair chair3 = new Chair("Taburetka",2,20);
        System.out.println(chair1);
        changeChair(chair1, new Consumer<Chair>() {
            @Override
            public void accept(Chair chair) {
                chair.cost = 2000;
                chair.legs = 6;
                chair.name = "SuperStul";
            }
        });
        System.out.println(chair1);
    }
}

class Chair {
    String name;
    int legs;
    int cost;

    public Chair(String name, int legs, int cost) {
        this.name = name;
        this.legs = legs;
        this.cost = cost;
    }

    @Override
    public String toString() {
        return "Chair{" +
                "name='" + name + '\'' +
                ", legs=" + legs +
                ", cost=" + cost +
                '}';
    }
}