package Collection.PriorityQueue;

import java.util.PriorityQueue;

public class PriorityQueueEx1 {
    public static void main(String[] args) {
        PriorityQueue<Integer> queue= new PriorityQueue<>();
        queue.add(1);
        queue.add(11);
        queue.add(45);
        queue.add(9);
        queue.add(7);
        queue.add(34);
        queue.add(5);
        System.out.println(queue.peek());
        System.out.println(queue.remove()); // удаляется элемент с наивысшим приоритетом
        System.out.println(queue);
    }
}
