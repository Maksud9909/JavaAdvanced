package Files.PathAndFiles;

import java.nio.file.Path;
import java.nio.file.Paths;

public class PathAndFilesEx1 {
    public static void main(String[] args) {
        Path filepath = Paths.get("test5.txt");
        Path directoryPath = Paths.get("/Users/maksudrustamov/Desktop/Maksud");
        System.out.println("FileName " + filepath.getFileName());
        System.out.println("FileName " + directoryPath.getFileName());

        System.out.println("-----------------------");

        System.out.println("getParent " + filepath.getParent());
        System.out.println("getParent " + directoryPath.getParent());

        System.out.println("-----------------------");

        System.out.println("Root " + filepath.getRoot());
        System.out.println("Root " + directoryPath.getRoot());

        System.out.println("-----------------------");

        System.out.println("isAbsolute " + filepath.isAbsolute());
        System.out.println("isAbsolute " + directoryPath.isAbsolute());

        System.out.println("-----------------------");

        System.out.println("toAbsolutePath " + filepath.toAbsolutePath());
        System.out.println("toAbsolutePath " + directoryPath.toAbsolutePath());

        System.out.println("-----------------------");

        System.out.println(" filepath.toAbsolutePath().getParent()" + filepath.toAbsolutePath().getParent());
        System.out.println(" filepath.toAbsolutePath().getRoot()" + filepath.toAbsolutePath().getRoot());

        System.out.println("-----------------------");

        System.out.println("directoryPath.resolve(filepath) " + directoryPath.resolve(filepath));


    }
}
