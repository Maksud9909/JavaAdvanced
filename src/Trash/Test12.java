package Trash;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class Test12 {
    public static void main(String[] args)  {
        try(RandomAccessFile accessFile = new RandomAccessFile("test10.txt","rw");
            FileChannel channel = accessFile.getChannel();
        ){
            String text = "Snow on the ground.\n" +
                    "Snow on the tree.\n" +
                    "Snow on the house.\n" +
                    "Snow on me!";
            ByteBuffer buffer = ByteBuffer.wrap(text.getBytes());
            channel.write(buffer);


        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }



    }
}
