package Files.PathAndFiles;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class PathEx5 {
    public static void main(String[] args) throws IOException {
        Path path = Paths.get("MaksudTest.txt");
//        Files.createFile(path);
//        String str = new String("My name is Maksud, and i promise that i will do sport at least 3 times a week");
//        Files.write(path,str.getBytes());

        List<String> list = Files.readAllLines(path);
        list.forEach(s -> System.out.println(s));
        System.out.println(list);
    }
}
