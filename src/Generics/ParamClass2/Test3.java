package Generics.ParamClass2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Test3 {
    public static void main(String[] args) {
        Pairs <String,Integer> pairs = new Pairs<>("Maksud",17);
        System.out.println(pairs);

        System.out.println("-------");


        CustomList <String> list = new CustomList<>();
        list.addItem("Maksud");
        list.addItem("Anton");
        System.out.println(list.getFirstItem());
    }
}

class CustomList <E>{
    private List<E> list = new ArrayList<>();

    public void addItem (E value){
        list.add(value);
    }



    public List<E> getList() {
        return list;
    }

    public void setList(List<E> list) {
        this.list = list;
    }

    public E getFirstItem(){
        return list.get(0);
    }


}














class Box <V,T> {
    private V v;
    private T t;

    public Box(V v, T t) {
        this.v = v;
        this.t = t;
    }

    public V getV() {
        return v;
    }

    public void setV(V v) {
        this.v = v;
    }

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }

    @Override
    public String toString() {
        return "Box{" +
                "v=" + v +
                ", t=" + t +
                '}';
    }
}

class Pairs <K,V> {
   private K k;
   private V v;

    public Pairs(K k, V v) {
        this.k = k;
        this.v = v;
    }

    public K getK() {
        return k;
    }

    public void setK(K k) {
        this.k = k;
    }

    public V getV() {
        return v;
    }

    public void setV(V v) {
        this.v = v;
    }

    @Override
    public String toString() {
        return "Pairs{" +
                "k=" + k +
                ", v=" + v +
                '}';
    }
}
