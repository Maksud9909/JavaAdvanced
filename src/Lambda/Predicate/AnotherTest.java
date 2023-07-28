package Lambda.Predicate;

import java.util.ArrayList;
import java.util.function.Predicate;

public class AnotherTest {
    void testWorkers(ArrayList<ItWorker> itWorkers, Predicate<ItWorker> predicate){
        for (ItWorker it:itWorkers) {
            if (predicate.test(it)){
                System.out.println(it);
            }
        }
    }
    public static void main(String[] args) {
    AnotherTest info =  new AnotherTest();
    ArrayList<ItWorker> workers = new ArrayList<>();
    ItWorker itWorker1 = new ItWorker("Maksud",18,"Rustamov");
    ItWorker itWorker2 = new ItWorker("Anton",19,"Sokolov");
    ItWorker itWorker3 = new ItWorker("Xamidulo",23,"Xamidovich");
    workers.add(itWorker2);
    workers.add(itWorker1);
    workers.add(itWorker3);
    info.testWorkers(workers,itWorker ->  itWorker.age > 18 );
}


}

class ItWorker {
    String name;
    int age;
    String surname;

    public ItWorker(String name, int age, String surname) {
        this.name = name;
        this.age = age;
        this.surname = surname;
    }

    @Override
    public String toString() {
        return "ItWorker{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", surname='" + surname + '\'' +
                '}';
    }
}


