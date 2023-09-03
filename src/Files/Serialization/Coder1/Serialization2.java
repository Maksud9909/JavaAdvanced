package Files.Serialization.Coder1;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Serialization2 {
    public static void main(String[] args) {
        Employee employee = new Employee("Mariya","IT",28,700);
        try (ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("Employees2.bin"))

        ){

            outputStream.writeObject(employee);
            System.out.println("Done");

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
