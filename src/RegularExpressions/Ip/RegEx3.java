package RegularExpressions.Ip;

import java.util.regex.Pattern;

public class RegEx3 {
    void checkIp(String ip){
        String regex = "((25[0-5]|2[0-4]\\d|[01]?\\d?\\d)(\\.)){3}" +
                "(25[0-5]|2[0-4]\\d |[01]?\\d?\\d)";
        System.out.println(ip + " is OK? "+ Pattern.matches(regex,ip));

    }
    public static void main(String[] args) {
        String ip1 = new String("192.168.1.100");
        String ip2 = new String("192.16.193.98");
        RegEx3 regEx3 = new RegEx3();
        regEx3.checkIp(ip1);
        regEx3.checkIp(ip2);
    }
}
