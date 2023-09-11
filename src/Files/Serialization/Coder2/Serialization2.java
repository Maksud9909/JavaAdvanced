package Files.Serialization.Coder2;

import Comparation.Employee.Employee;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Serialization2 {
    public static void main(String[] args) throws ClassNotFoundException {
        Employee bestEmployee;
        try(ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("Employees2.bin"))){

            bestEmployee = (Employee) inputStream.readObject();
            System.out.println(bestEmployee);

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
