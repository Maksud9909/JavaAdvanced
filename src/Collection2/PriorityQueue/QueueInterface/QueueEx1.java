package Collection2.PriorityQueue.QueueInterface;

import java.util.LinkedList;
import java.util.Queue;

public class QueueEx1 {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();
        queue.add("Sasha");
        queue.add("Maksud");
        queue.add("Sancho");
        queue.add("Chris");
        queue.add("Anton");
        System.out.println(queue);
        System.out.println(queue.remove("Anton"));
        System.out.println(queue);
    }
}
