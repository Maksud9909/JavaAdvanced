import javax.management.DescriptorKey;
import java.util.*;

public class Delete {
    String name;
    int salary;
    public static void main(String[] args) {

        Delete delete1 = new Delete("Maksud",100);
        Delete delete2 = new Delete("Maksud",100);
        System.out.println(delete1.equals(delete2));
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Delete delete = (Delete) o;
        return Objects.equals(name, delete.name);
    }

    public Delete(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Delete{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }

//    @Override
//    public int hashCode() {
//        return Objects.hash(name);
//    }
}