package Collection.HashMap.equals;

import Generics.Game.Test;

import java.util.HashMap;
import java.util.Objects;

public class Test1 {
    String first;
    int second;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Test1 test1 = (Test1) o;
        return Objects.equals(first, test1.first) && Objects.equals(second, test1.second);
    }

//    @Override
//    public int hashCode() {
//        return Objects.hash(first.length() * 2 + second * 6);
//    }


    public static void main(String[] args) {
        Test1 test1 = new Test1("Maksud",18);

        Test1 test2 = new Test1("Maksud",18);

        HashMap<String,Integer> map = new HashMap<>();

        System.out.println(test2.hashCode());
        System.out.println(test1.hashCode());
    }

    public Test1(String first, int second) {
        this.first = first;
        this.second = second;
    }
}
