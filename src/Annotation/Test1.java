package Annotation;

public class Test1 {
    public static void main(String[] args) {
        Parent parent = new Parent("Maksud");

    }
}


class Parent {
    public String name;

    public Parent(String name) {
        this.name = name;
    }
    public void showInfo(){
        System.out.println("It is Parent class.Name = " + name);
    }
}

class Child extends Parent{

    public Child(String name) {
        super(name);
    }

    @Override
    public void showInfo() {
        System.out.println("It is Child class.Name = " + name);
    }
}