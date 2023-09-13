package Files.Serialization.Coder2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.List;

public class Deserialization1 {
    public static void main(String[] args) {
        List<String> employees = new ArrayList<>();
        try (ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("employee1.bin"))){
            employees = (ArrayList)inputStream.readObject();
            System.out.println(employees);


        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
