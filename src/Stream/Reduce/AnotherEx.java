package Stream.Reduce;

import java.util.Arrays;

public class AnotherEx {
    public static void main(String[] args) {
        String [] arr = {"Hello","Ok","Good","Etc"};
        String result = Arrays.stream(arr).reduce((acum,element)->{
            return acum + element;
        }).get();
        System.out.println(result);
    }
}
