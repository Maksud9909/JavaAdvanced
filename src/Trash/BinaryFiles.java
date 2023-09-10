package Trash;

import java.io.*;

public class BinaryFiles {
    public static void main(String[] args) throws IOException {

       try (
               DataOutputStream outputStream = new DataOutputStream(new FileOutputStream("data.bin"));
               DataInputStream inputStream = new DataInputStream(new FileInputStream("data.bin"));
               ){
           outputStream.writeInt(234);
           outputStream.write(new byte[] {23,3,3,3,2,23,6});
           outputStream.writeBoolean(true);

           System.out.println(inputStream.read());
           System.out.println(inputStream.readInt());
           System.out.println(inputStream.readBoolean());
       }
    }


}
