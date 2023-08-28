package Trash;


import Collection.ArrayList1.Part4.ArrayList4;
import Lambda.LambdaExxpressions.StudentInfo;

import java.awt.*;
import java.util.*;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class Queuee {

    public void method(int count){

    }

    public void check(){}
    public static void main(String[] args) {
        House house1 = new House("Chilonzor",100,true);
        House house2 = new House("Abay",290,false);
        House house3 = new House("Beach",300,true);
        House house4 = new House("Dostlik",120,false);
        List <House> list = new ArrayList<>();
        list.add(house1);
        list.add(house2);
        list.add(house3);
        list.add(house4);
        System.out.println();
        Map<Boolean, List<House>> result = list.parallelStream().collect(Collectors.partitioningBy(house -> house.getLocation() == "Abay"));
        System.out.println(result);














        }
    }





class House {
    public House() {
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getSquareFeet() {
        return squareFeet;
    }

    public void setSquareFeet(int squareFeet) {
        this.squareFeet = squareFeet;
    }

    public boolean isFurniture() {
        return furniture;
    }

    public void setFurniture(boolean furniture) {
        this.furniture = furniture;
    }

    String location;
    int squareFeet;
    boolean furniture;

    @Override
    public String toString() {
        return "House{" +
                "location='" + location + '\'' +
                ", squareFeet=" + squareFeet +
                ", furniture=" + furniture +
                '}';
    }

    @Override
    public boolean equals(Object o) {


        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        House house = (House) o;
        return squareFeet == house.squareFeet && furniture == house.furniture && Objects.equals(location, house.location);
    }

    @Override
    public int hashCode() {
        return Objects.hash(location, squareFeet, furniture);
    }

    public House(String location, int squareFeet, boolean furniture) {
        this.location = location;
        this.squareFeet = squareFeet;
        this.furniture = furniture;
    }
}