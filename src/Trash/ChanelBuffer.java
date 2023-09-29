package Trash;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class ChanelBuffer {
    public static void main(String[] args) throws IOException {
        try (RandomAccessFile accessFile = new RandomAccessFile("test10.txt","rw"); // создали файл
             FileChannel channel = accessFile.getChannel(); // подключились к нему
        ){
            ByteBuffer buffer = ByteBuffer.allocate(30);// создали 30 мест для букв
            StringBuilder poem = new StringBuilder(); // место куда будем записывать слова

            int byteRead = channel.read(buffer);

            while (byteRead>0){
                System.out.println("Read " + byteRead);
                buffer.flip();

                while (buffer.hasRemaining()){
                    poem.append((char) buffer.get());
                }
                buffer.clear();
                byteRead = channel.read(buffer);
            }
            System.out.println(poem);
        }
    }
}
