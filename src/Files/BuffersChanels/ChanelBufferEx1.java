package Files.BuffersChanels;


import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class ChanelBufferEx1 {
    public static void main(String[] args) throws IOException {
        try (RandomAccessFile file = new RandomAccessFile("test10.txt","rw");
                FileChannel channel = file.getChannel();
                ){
            ByteBuffer buffer = ByteBuffer.allocate(25);
            StringBuilder stix = new StringBuilder();
            int byteRead = channel.read(buffer); // прочитали 25 байт из буффера

            while (byteRead>0){
                System.out.println("Read " + byteRead);
                buffer.flip(); // когда мы вызываем это мы можем читать инфо из буфера

                while (buffer.hasRemaining()){
                    stix.append((char) buffer.get());
                }
                buffer.clear(); // мы ее обнуляем, так
                byteRead = channel.read(buffer); // и затем снова начинаем записывать в канал стих
            }
            System.out.println(stix);

        }
    }
}
