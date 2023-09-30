package Trash;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class ChanelBuffer2 {
    public static void main(String[] args) throws IOException {
        try (RandomAccessFile file = new RandomAccessFile("test10.txt","rw");
             FileChannel channel10 = file.getChannel())
        {

        }
        String text = "Snow on the ground.\n" +
                "Snow on the tree.\n" +
                "Snow on the house.\n" +
                "Snow on me!";
        ByteBuffer buffer = ByteBuffer.wrap(text.getBytes());



    }
}
