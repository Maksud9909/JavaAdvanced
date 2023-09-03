package Files.Serialization.Coder1;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Serialization1 {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Maksud");
        names.add("Ivan");
        names.add("Elena");

        try (ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("employee1.bin"));
        ){
            outputStream.writeObject(names);

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}
