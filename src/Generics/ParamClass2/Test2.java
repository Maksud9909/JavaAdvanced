package Generics.ParamClass2;

public class Test2 {
    public static void main(String[] args) {
        Generics <String> stringGenerics = new Generics<>();
        Generics <Integer> integerGenerics = new Generics<>();

        stringGenerics.add("Maksud");
        integerGenerics.add(34);
        System.out.println(stringGenerics);
        System.out.println(integerGenerics);



    }


}


class Generics <T>{
    private T t;

//    public Generics.ParamClass2.Generics(T t) {
//        this.t = t;
//    }

    public void add(T t){
        this.t = t; // this method makes var
    }

    public T getT(){
        return t;
    }

    @Override
    public String toString() {
        return "Generics.ParamClass2.Generics{" +
                "t=" + t +
                '}';
    }
}