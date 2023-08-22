package Trash;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Example1 {
    public static void main(String[] args) throws IOException {
        String info= new String("My name is Maksud, i am 17 years of age");
        try (FileReader writer = new FileReader("Test1.txt")){
            int character;
            while ((character=writer.read())!=-1){
                System.out.print((char) character);
            }
            System.out.println("Done");
        }
    }
}
