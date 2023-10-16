package RegularExpressions.RegEx.MathcesSplit;

import java.util.Arrays;

public class MatchesSplits {
    public static void main(String[] args) {
        String info = "Chuck Norris, USA, Hollywood, All stars street, 87, Flat 21" +
                " email: chuck@gmail.com, Postcode: USA23, Phone Number: +136478952. " +
                "Ivanov Vasiliy, Russia, Moscow, Lenin street, 51, Flat 48, " +
                " email: vivanov@mail.ru , Postcode: AA99, Phone Number: +123456789;" +
                "Petrova Mariya, Ukraine, Kiyev, Lomonosov street, 33, Flat 18," +
                " email: masha@yandex.uz, Postcode: UKR54, Phone Number: +987654321;";

        String s2 = "masha@yandex.uz";

        boolean matcher = s2.matches("\\w+@+\\w+.(uz|ru|com)");
        System.out.println(matcher);

        String [] split = info.split(" ");
        System.out.println(Arrays.toString(split));
    }
}
