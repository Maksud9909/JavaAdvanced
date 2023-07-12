package NestedClass.Inner;

public class Car {
    String color;

    int doorCount;
    Engine engine;

    public Car(String color, int doorCount) {
        this.color = color;
        this.doorCount = doorCount;
//        this.engine = this.new Engine(horsePower);
    }

    public void setEngine (Engine engine){
        this.engine = engine;
    }
    @Override
    public String toString() {
        return "Car{" +
                "color='" + color + '\'' +
                ", doorCount=" + doorCount +
                ", engine=" + engine +
                '}';
    }
    public  class Engine {
        private int horsePower;
        public Engine(int horsePower) {
            this.horsePower = horsePower;
        }


        @Override
        public String toString() {
            return "My Engine has {" +
                    "horsePower=" + horsePower +
                    '}';
        }
    }
}

class Test {
    public static void main(String[] args) {
        Car car = new Car("Yellow",4);
        Car.Engine engine = car.new Engine(150);
        car.setEngine(engine);
        System.out.println(car);



        Car.Engine car2 = new Car("Brown",2).new Engine(134);
        System.out.println(car2);
    }
}
