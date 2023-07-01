package Collection.DequeInterface;

import java.util.LinkedList;

public class LinkedList2 {
    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("Maksud");
        linkedList.add("Murad");
        linkedList.add("Anton");
        linkedList.add("Alisa");

        LinkedList<String> linkedList1 = new LinkedList<>();
        linkedList1.addFirst("Maksud");
        linkedList1.addFirst("Maksud");
        linkedList1.add(2,"Antonio");
        System.out.println(linkedList1);




        linkedList1.peek();
        System.out.println(linkedList.peek());
        System.out.println();
        System.out.println(linkedList);
    }
}
