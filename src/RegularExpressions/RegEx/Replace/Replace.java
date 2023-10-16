package RegularExpressions.RegEx.Replace;

public class Replace {
    public static void main(String[] args) {
        String info = "My    name    is   Maksud   ";
        System.out.println(info);

        info = info.replaceAll(" {2,}", " ");
        System.out.println(info);
    }
}
