package Generics.ParamClass2;

import java.beans.Introspector;

public class ParameterizedClass2 {
    public static void main(String[] args) {
        Pair <String, Integer> Pair1 = new Pair<>("Maksud",17);
        System.out.println(Pair1);

        Pair <Integer, Double> Pair2 = new Pair<>(17,17.5);
        System.out.println(Pair2);

        OtherPair<Integer> otherPair = new OtherPair<>(17,18);
        System.out.println(otherPair);
    }
}
class Pair <V1,V2>{
    private V1 value1;
    private V2 value2;

    @Override
    public String toString() {
        return "Pair{" +
                "value1=" + value1 +
                ", value2=" + value2 +
                '}';
    }
    public Pair(V1 value1, V2 value2) {
        this.value1 = value1;
        this.value2 = value2;
    }

    public V1 getValue1() {
        return value1;
    }

    public V2 getValue2() {
        return value2;
    }
}

class OtherPair <V>{
    private V value1;
    private V value2;

    @Override
    public String toString() {
        return "Pair{" +
                "value1=" + value1 +
                ", value2=" + value2 +
                '}';
    }
    public OtherPair(V value1, V value2) {
        this.value1 = value1;
        this.value2 = value2;
    }

    public V getValue1() {
        return value1;
    }

    public V getValue2() {
        return value2;
    }
}

