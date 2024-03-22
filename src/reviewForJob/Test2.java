package reviewForJob;

import Reflection.Employee;

import java.util.List;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.stream.Collectors;

public class Test2 {
    public static void main(String[] args) {
        House house1 = new House("Mirzo-Ulugbek",4,100);
        House house2 = new House("Yunusobad",3,89);
        House house3 = new House("Sergeli",1,0);
        List<House> list = List.of(house1,house2,house3);
//        System.out.println(list);

        OptionalDouble optionalDouble = list.stream().mapToDouble(House::getSqFeet).reduce((accum, area)->{
            return accum + area;
        });
        System.out.println("----");

        System.out.println(list.stream().filter(house -> house.sqFeet > 1).collect(Collectors.toList()));

        if (optionalDouble.isPresent()){
            System.out.println(optionalDouble.getAsDouble());
        }
        else {
            System.out.println("Empty");
        }







    }
}



class House{
    String district;

    int rooms;

    double sqFeet;

    @Override
    public String toString() {
        return "House{" +
                "district='" + district + '\'' +
                ", rooms=" + rooms +
                ", sqFeet=" + sqFeet +
                '}';
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public int getRooms() {
        return rooms;
    }

    public void setRooms(int rooms) {
        this.rooms = rooms;
    }

    public double getSqFeet() {
        return sqFeet;
    }

    public void setSqFeet(double sqFeet) {
        this.sqFeet = sqFeet;
    }

    public House(String district, int rooms, double sqFeet) {
        this.district = district;
        this.rooms = rooms;
        this.sqFeet = sqFeet;
    }
}
