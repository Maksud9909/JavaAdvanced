package Collection.Stack;

import java.util.Stack;

public class Stackk {
    static void abc1(){
        System.out.println("abc1 starts");
        System.out.println("abc1 ends");
    }
    static void abc2(){
        System.out.println("abc2 starts");
        abc1();
        System.out.println("abc2 ends");
    }
    static void abc3(){
        System.out.println("abc3 starts");
        abc2();
        System.out.println("abc3 ends");
    }

    public static void main(String[] args) {
        System.out.println("Main starts");
        abc3();
        System.out.println("Main ends");
    }
}
