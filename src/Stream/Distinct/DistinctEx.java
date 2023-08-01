package Stream.Distinct;

import java.util.stream.Stream;

public class DistinctEx {
    public static void main(String[] args) {
        Stream <Integer> stream = Stream.of(1,2,3,4,5,1,2,3);
        stream.distinct().forEach(System.out::print);
    }
}
