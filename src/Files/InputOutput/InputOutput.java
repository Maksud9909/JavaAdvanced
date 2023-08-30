package Files.InputOutput;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class InputOutput {
    public static void main(String[] args) {
        try (
                FileInputStream inputStream = new FileInputStream(
                        "Users/maksudrustamov/Desktop/Снимок экрана 2023-08-29 в 22.39.44");
                FileOutputStream outputStream = new FileOutputStream("Снимок экрана 2023-08-29 в 22.39.44")
                ){

            int i;
            while ((i= inputStream.read())!=-1){
                outputStream.write(i);
            }
            System.out.println("Done");

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
