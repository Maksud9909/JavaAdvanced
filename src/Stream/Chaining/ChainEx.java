package Stream.Chaining;

import java.util.Arrays;

public class ChainEx {
    public static void main(String[] args) {
        int arr [] = {12,45,23,5,6,2,7,4,3,44,56,12,18,45,98};
        int result = Arrays.stream(arr).filter(num -> num%2==1).map(e->
        {
            if (e%3 == 0) {
                e = e / 3;
            }
        return e;}).reduce((a,e)-> a+=e).getAsInt();
        System.out.println(result);
    }
}
