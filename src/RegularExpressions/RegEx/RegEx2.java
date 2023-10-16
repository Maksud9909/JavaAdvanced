package RegularExpressions.RegEx;

import java.nio.file.Path;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegEx2 {
    public static void main(String[] args) {
        int couter = 0;
        String s1 = "ab ab fg hr uh ko pcl u 2 5 76 978";
        Pattern pattern1 = Pattern.compile("[a-c7-9]"); // создаем шаблон
        Matcher matcher = pattern1.matcher(s1); // шаблон сверяем на соответствие с String

        while (matcher.find()){
            System.out.println("Postion " + matcher.start() + "  " + matcher.group() );
            couter++;
        }
        System.out.println(couter);
    }
}
