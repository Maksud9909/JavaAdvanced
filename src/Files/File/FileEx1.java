package Files.File;

import javax.swing.plaf.metal.MetalIconFactory;
import java.io.File;
import java.io.IOException;
import java.time.chrono.MinguoDate;

public class FileEx1 {
    public static void main(String[] args) throws IOException {
        File file1 = new File("WIUT.txt");
        file1.createNewFile();
        System.out.println(file1.exists());
        System.out.println(file1.length());




        File folder = new File("/Users/maksudrustamov/Desktop/Test1");
        System.out.println(folder.isHidden());

        File insideFolder = new File("/Users/maksudrustamov/Desktop/Test1/Test2");
        System.out.println(insideFolder.isDirectory());








    }
}
