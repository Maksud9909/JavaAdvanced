package Files.FileWriter;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterEx {
    public static void main(String[] args) throws IOException {
        String rubai = "Омар Хайям\n" +
                "Много лет размышлял я над жизнью земной.\n" +
                "Непонятного нет для меня под луной.\n" +
                "Мне известно, что мне ничего не известно! —\n" +
                "Вот последняя правда, открытая мной.\n";

        FileWriter writer = null;

        try {
            writer = new FileWriter("test3.txt",true);
            writer.write(rubai);
            writer.append("Privet");
            System.out.println("Done");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        finally {
            writer.close();
        }


    }
}
