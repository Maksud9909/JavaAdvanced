package Files.PathAndFiles;

import org.w3c.dom.ls.LSOutput;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.IdentityHashMap;
import java.util.Map;
import java.util.Objects;

public class PathAndFilesEx2 {
    public static void main(String[] args) throws IOException {
        Path filePath = Paths.get("/Users/maksudrustamov/Desktop/WEST");
        if (!Files.exists(filePath)){
            Files.createFile(filePath);
        }
        File file = new File("/Users/maksudrustamov/Desktop/Hello");
        file.createNewFile();

    }
}
