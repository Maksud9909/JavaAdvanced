package Trash;

import java.io.*;

public class DataOutputStream1 {
    public static void main(String[] args) {
        try (DataOutputStream outputStream = new DataOutputStream(new FileOutputStream("Training.bin"));
             DataInputStream inputStream = new DataInputStream(new FileInputStream("Training.bin"))
        ){
            outputStream.writeBoolean(true);
            outputStream.writeBoolean(false);
            outputStream.writeChars("My name is Maksud");



            boolean input  = inputStream.readBoolean();
            char str = inputStream.readChar();
            System.out.println(str);

            System.out.println(input);

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
