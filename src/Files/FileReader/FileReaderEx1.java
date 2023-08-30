package Files.FileReader;


import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderEx1 {
    public static void main(String[] args) throws IOException {
        FileReader fileReader = null;
        try {
            fileReader = new FileReader("test1.txt");
            int character;
            while ((character = fileReader.read())!=-1){
                System.out.print((char) character);
            }


        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        finally {
            fileReader.close();
        }
    }
}




////public static void main(String[] args) throws IOException {
//    FileReader reader = null;
//    try {
//         reader = new FileReader("test2.txt");
//         int character;
//         while ((character=reader.read())!=-1) {
//             System.out.print((char) character);
//         }
//        System.out.println();
//        System.out.println("Done");
//    } catch (IOException e) {
//        throw new RuntimeException(e);
//    }
//    finally {
//        reader.close();
//    }
//}