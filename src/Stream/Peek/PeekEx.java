package Stream.Peek;

import java.util.stream.Stream;

public class PeekEx {
    public static void main(String[] args) {
        Stream<Integer> stream = Stream.of(1,2,3,4,5,1,2,3);
        stream.distinct().peek(System.out::println).count();

    }
}
