package Collection.PriorityQueue;

import Collection.Set.Student;

import java.util.Objects;
import java.util.PriorityQueue;

public class PriorityQueueEx2 {
    public static void main(String[] args) {
        PriorityQueue<Student2> queue = new PriorityQueue<>();
        Student2 student1 = new Student2("Anatoliy", "Vlasov",3);
        Student2 student2 = new Student2("Maksud","Rustamov",5);
        Student2 student3 = new Student2("Murad","Rustamov",1);
        Student2 student4 = new Student2("Anton","Rustamov",4);
        queue.add(student1);
        queue.add(student2);
        queue.add(student3);
        queue.add(student4);
        // queue.clear(); // полностью очищает выбор
        System.out.println(queue);

    }
}


