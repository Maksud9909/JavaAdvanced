package Collection.Stack;

import java.util.Deque;
import java.util.Stack;

public class Stack3 {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        stack.push("1 element");
        stack.push("2 element");
        stack.push("3 element");
        System.out.println(stack);

        String peek = stack.peek();
        System.out.println(peek);

        String removedElement = stack.pop();
        System.out.println(removedElement);
        System.out.println(stack);

        boolean isEmpty = stack.isEmpty();
        System.out.println(isEmpty);



    }
}
