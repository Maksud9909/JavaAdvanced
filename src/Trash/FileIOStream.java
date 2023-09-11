package Trash;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileIOStream {
    String surname = "Rustamov";
    public static void main(String[] args) throws FileNotFoundException {
        try (FileOutputStream outputStream = new FileOutputStream("Read.txt");
                FileInputStream inputStream = new FileInputStream("Read.txt")

        ){
            FileIOStream fos = new FileIOStream();
            byte [] name = "Maksud".getBytes();
            byte [] surname = fos.surname.getBytes();
            outputStream.write(name);
            outputStream.write(surname);


            int byteRead;
            while ((byteRead = inputStream.read()) != -1){
                System.out.print(byteRead + " ");
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
