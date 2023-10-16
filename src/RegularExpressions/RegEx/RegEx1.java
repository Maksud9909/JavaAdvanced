package RegularExpressions.RegEx;

import java.nio.file.Path;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegEx1 {
    public static void main(String[] args) {
        String info = "Chuck Norris, USA, Hollywood, All stars street, 87, Flat 21" +
                " email: chuck@gmail.com, Postcode: USA23, Phone Number: +136478952. " +
                "Ivanov Vasiliy, Russia, Moscow, Lenin street, 51, Flat 48, " +
                " email: vivanov@mail.ru , Postcode: AA99, Phone Number: +123456789;" +
                "Petrova Mariya, Ukraine, Kiyev, Lomonosov street, 33, Flat 18," +
                " email: masha@yandex.uz, Postcode: UKR54, Phone Number: +987654321;";

        Pattern pattern = Pattern.compile("\\w+@+\\w+\\.(ru|com|uz)");
        Matcher matcher = pattern.matcher(info);

        while (matcher.find()){
            System.out.println(matcher.group());
        }

    }
}
