package Trash;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public abstract class Test {
    public static void main(String[] args) {
        Test test = new Test(2005) {
            @Override
            public void call(long outputNumber) {
                System.out.println(outputNumber);
            }

            @Override
            public void ring(long inputNumber) {
                System.out.println(inputNumber);
            }
        };
        test.call(998525858);
        test.ring(239_847_928);
    }
private int year;

    public Test(int year) {
        this.year = year;
    }

    public abstract void call(long outputNumber);
    public abstract void ring (long inputNumber);
}