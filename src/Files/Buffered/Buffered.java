package Files.Buffered;

import java.io.*;
import java.util.Arrays;
import java.util.TreeSet;

public class Buffered {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(
                new FileReader("test3.txt"));
             BufferedWriter writer = new BufferedWriter(new FileWriter("test4.txt"))
        ){
//            int character;
//            while ((character=reader.read())!=-1){
//                writer.write(character);
//            }

            String line;
            while ((line=reader.readLine())!=null){
                writer.write(line);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}
