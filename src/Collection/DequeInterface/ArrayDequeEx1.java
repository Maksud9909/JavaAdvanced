package Collection.DequeInterface;

import java.util.ArrayDeque;
import java.util.Deque;

public class ArrayDequeEx1 {
    public static void main(String[] args) {
        Deque<Integer> deque = new ArrayDeque<>();
        deque.addFirst(8);
        deque.addLast(45);
        deque.add(43);
        deque.add(20);
        deque.offerFirst(56);
        deque.offerLast(78);
        System.out.println(deque);
        System.out.println(deque.removeFirst());
        System.out.println(deque.poll());
        System.out.println(deque.poll()); // если использовать просто poll то он удалит с начала
    }
}
