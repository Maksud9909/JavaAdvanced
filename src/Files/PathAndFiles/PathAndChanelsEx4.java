package Files.PathAndFiles;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class PathAndChanelsEx4 {
    public static void main(String[] args) throws IOException {
        Path path = Paths.get("/Users/maksudrustamov/Desktop/File.txt");
        Files.move(Paths.get("test10.txt"),Paths.get("test11.txt"));


    }
}
