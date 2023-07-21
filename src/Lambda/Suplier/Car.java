package Lambda.Suplier;

public class Car {
    public String model;
    public String color;
    public double engine;

    public Car(String model, String color, int engine) {
        this.model = model;
        this.color = color;
        this.engine = engine;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", engine=" + engine +
                '}';
    }
}
