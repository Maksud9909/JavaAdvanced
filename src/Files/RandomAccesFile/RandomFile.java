package Files.RandomAccesFile;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;


public class RandomFile {
    public static void main(String[] args) {
        try (RandomAccessFile accessFile = new RandomAccessFile("example.txt","rw")){

            String name = "Maksud";
            String work = "Back-end developer";

            accessFile.writeChars("My name is " + name + " " + "and i work as " + work);



            byte[] buffer = new byte[name.length() + work.length()];
            System.out.println(accessFile.read(buffer));

            accessFile.seek(0);

            String result = new String(buffer);
            System.out.println(result);









        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
