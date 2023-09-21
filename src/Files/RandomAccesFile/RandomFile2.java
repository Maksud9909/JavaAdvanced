package Files.RandomAccesFile;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomFile2 {
    public static void main(String[] args) {
        try (RandomAccessFile file = new RandomAccessFile("test10.txt","rw")){

//            int firstLetter = file.read();
//            System.out.println((char) firstLetter);
//
//
//            String firstLine = file.readLine();
//            System.out.println(firstLine);


            file.seek(20);
            String line = file.readLine();
            System.out.println(line);

            System.out.println(file.getFilePointer());

//            file.seek(0);
//            file.writeBytes("Privet ");

            file.seek(file.length() - 1); // так мы можем попасть в конец файла
            file.writeBytes(" \n \n\t\t William");


        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
