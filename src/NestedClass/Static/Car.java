package NestedClass.Static;

public class Car {
    String color;
    int doorCount;
    Engine engine;

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public Car(String color, int doorCount) {
        this.color = color;
        this.doorCount = doorCount;
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
        int horsePower;
        public Engine(int horsePower) {
            this.horsePower = horsePower;
        }


        @Override
        public String toString() {
            return "Engine{" +
                    "horsePower=" + horsePower +
                    '}';
        }
    }
}

class Test {
    public static void main(String[] args) {


        Car car = new Car("Yellow",4);
        Car.Engine engine = car.new Engine(159);
        car.setEngine(engine);
        System.out.println(car);
    }
}