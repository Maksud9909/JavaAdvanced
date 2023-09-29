package Files.BuffersChanels;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class ChanelBufferEx2 {
    public static void main(String[] args) {
        try (RandomAccessFile file2 = new RandomAccessFile("test10.txt","rw");
             FileChannel channel2 = file2.getChannel();
        ){
            ByteBuffer buffer = ByteBuffer.allocate(25);
            StringBuilder stix = new StringBuilder();
            int byteRead = channel2.read(buffer); // прочитали 25 байт из буффера

            while (byteRead>0){
                System.out.println("Read " + byteRead);
                buffer.flip(); // он включает режим чтения

                while (buffer.hasRemaining()){
                    stix.append((char) buffer.get());
                }
                buffer.clear(); // мы ее обнуляем, так
                byteRead = channel2.read(buffer); // и затем снова начинаем записывать в канал стих
            }
            System.out.println(stix);

            String text = "\nAlbert Einstein quote: there are only two ways to live your life. " +
                    "One is as though nothing is a miracle." +
                    " The other is as though everything is a miracle.";

            ByteBuffer byteBuffer = ByteBuffer.wrap(text.getBytes());
            channel2.write(byteBuffer);

//            ByteBuffer buffer1 = ByteBuffer.allocate(text.getBytes().length);
//            buffer1.put(text.getBytes());
//            buffer1.flip();
//            channel2.write(buffer1);

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}