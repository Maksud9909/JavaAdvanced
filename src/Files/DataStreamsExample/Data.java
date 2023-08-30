package Files.DataStreamsExample;

import java.io.*;

public class Data {
    public static void main(String[] args) {
        try (
                DataOutputStream outputStream = new DataOutputStream(new FileOutputStream("my_test.bin"));
                DataInputStream inputStream = new DataInputStream(new FileInputStream("my_test.bin"))
                ){
            outputStream.writeBoolean(false);
            outputStream.writeShort(2);
            outputStream.writeDouble(2.453453);
            outputStream.writeLong(1_000242342L);
            outputStream.writeInt(1324);



            System.out.println(inputStream.readBoolean());
            System.out.println(inputStream.readShort());
            System.out.println(inputStream.readLong());
            System.out.println(inputStream.readInt());
            System.out.println(inputStream.read());


        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
