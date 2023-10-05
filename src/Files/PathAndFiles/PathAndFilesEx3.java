package Files.PathAndFiles;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class PathAndFilesEx3 {
    public static void main(String[] args) throws IOException {
        Path filePath = Paths.get("/Users/maksudrustamov/Desktop/File.txt");
        Path directoryPath = Paths.get("/Users/maksudrustamov/Desktop/ForFiles");
        Path directoryBPath = Paths.get("/Users/maksudrustamov/Desktop/A");



        Files.move(directoryBPath,directoryBPath.resolve("Maksud"));




//        Files.copy(directoryBPath,directoryPath.resolve("B"));
//        Files.copy(filePath,directoryPath.resolve("File.txt"), StandardCopyOption.REPLACE_EXISTING);
//        Files.copy(filePath,directoryPath.resolve("Test.txt"));


    }
}
