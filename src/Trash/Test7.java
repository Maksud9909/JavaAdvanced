package Trash;

import java.io.*;

public class Test7 {

    public static void main(String[] args) throws IOException {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("FileCopy.txt"));
             BufferedReader reader = new BufferedReader(new FileReader("File.txt"))
        ){
            writer.write("Hello Maksud");
            writer.newLine();
            writer.write("Good luck with Java Development");

            String line;
            while ((line = reader.readLine()) !=null){
                writer.write(line);
            }
        }
    }
}
