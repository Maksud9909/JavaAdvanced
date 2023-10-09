package Files.WalkFileTree;

import java.nio.file.Path;
import java.nio.file.SimpleFileVisitor;

public class WalkFileTree2 {
    public static void main(String[] args) {

    }
}

class MyFileVisitor2 extends SimpleFileVisitor<Path>{
    Path source;
    Path destination;

    public MyFileVisitor2(Path source, Path destination) {
        this.source = source;
        this.destination = destination;
    }
}