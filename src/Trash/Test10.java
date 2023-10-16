package Trash;

import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test10 {
    public static void main(String[] args) {
        String word = "Maksud";
        Pattern pattern = Pattern.compile("\\b\\w{2}\\b");
        Matcher matcher = pattern.matcher(word);

        while (matcher.find()){
            System.out.println("Position " + matcher.start() + " " + matcher.group());
        }

        String str = new String("rmaksud822@gmail.ru");
        boolean matcher2  = str.matches("\\w+@+\\w+.(com|uz|ru)");
        System.out.println(matcher2);
    }
}
