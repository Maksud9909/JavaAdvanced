package Files.Serialization.Coder2;

import Files.Serialization.Student;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Deserialization2 {
    public static void main(String[] args) throws ClassNotFoundException {
        Student bestEmployee;
        try(ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("Employees2.bin"))){

            bestEmployee = (Student) inputStream.readObject();
            System.out.println(bestEmployee);

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
