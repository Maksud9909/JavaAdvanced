package Files.Serialization.Coder1;



import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Serialization2 {
    public static void main(String[] args) throws FileNotFoundException {
        Student student = new Student("Maksud","IT",18,900);
        try (ObjectOutputStream outputStream = new ObjectOutputStream(
                new FileOutputStream("Employees2.bin"))){


            outputStream.writeObject(student);
            System.out.println("Done");

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
