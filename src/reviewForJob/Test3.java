package reviewForJob;

import java.util.Arrays;

public class Test3 {
    public static void main(String[] args) {
        String [] arr = {"Wassup","Hello","Sup","Mike"};

        String s = Arrays.stream(arr).reduce("NIGA",(accum,element)->{
           return accum + element;
        });
        System.out.println(s);

    }
}
