package Trash;

public class Enum11 {

}


enum ShapeList{
    Rectangle, Square,Circle;
}

class Shape{
    ShapeList shapeList;
    double area;

    public Shape(ShapeList shapeList, double area) {
        this.shapeList = shapeList;
        this.area = area;
    }

    @Override
    public String toString() {
        return "Shape{" +
                "shapeList=" + shapeList +
                ", area=" + area +
                '}';
    }

    void infoShape(){
        switch (shapeList){
            case Circle:
            case Square:
            case Rectangle:
                System.out.println("Area " + area);
        }
    }

    public static void main(String[] args) {
        Shape shape1 = new Shape(ShapeList.Circle,123.3);
        Shape shape2 = new Shape(ShapeList.Circle,1234.4);
        Shape shape3  = new Shape(ShapeList.Circle,345.5);
        shape3.infoShape();
        shape2.infoShape();
        shape1.infoShape();


    }
}