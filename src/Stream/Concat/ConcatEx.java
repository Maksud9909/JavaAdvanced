package Stream.Concat;

import java.util.stream.Stream;

public class ConcatEx {
    public static void main(String[] args) {
        Stream<Integer> stream1 = Stream.of(1,2,4,65,7,4,3,3,5,6,6,3);
        Stream<Integer> stream2 = Stream.of(1,2,4,65,7,4);
        Stream<Integer> stream = Stream.concat(stream2,stream1);
        stream.forEach(str-> System.out.print(str + " "));


    }
}
