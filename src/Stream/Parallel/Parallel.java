package Stream.Parallel;

import java.util.Arrays;
import java.util.List;

public class Parallel {
    public static void main(String[] args) {
        List<Double> list = Arrays.asList(1.0,2.5,10.0,0.25);
        double sumResult = list
                .parallelStream()
                .reduce((a,e)->a+e)
                .get();
        System.out.println(sumResult);

        double divisionResultP = list
                .parallelStream()
                .reduce((a,e)->a/e)
                .get();
        System.out.println("parallel " + divisionResultP );

        double divisionResult = list
                .stream()
                .reduce((a,e)->a/e)
                .get();
        System.out.println("parallel " + divisionResult );



    }
}
