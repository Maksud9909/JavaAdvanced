package Collection.Stack;

import java.util.Stack;

public class Stack2 {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        stack.push("Maksud");
        stack.push("Anton");
        stack.push("Aleksey");
        stack.push("Grisha");
        System.out.println(stack.peek()); // it helps to peek the last one


    }
}
