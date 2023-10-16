package RegularExpressions.Replace;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Replace2 {
    public static void main(String[] args) {
        String str = "    12345678901234567890123;\n" +
                "    98765432109876543210987;\n" +
                "    55555555555555555555555";

        Pattern pattern = Pattern.compile("(\\d{4})(\\d{4})(\\d{4})(\\d{4})(\\d{2})(\\d{2})(\\d{3})");
        Matcher matcher = pattern.matcher(str);

//        String newString = matcher.replaceAll("$5/$6 $1 $2 $3 $4 CVV $7");
//        System.out.println(newString);

        while (matcher.find()){
            System.out.println(matcher.group(1));
        }

    }
}
