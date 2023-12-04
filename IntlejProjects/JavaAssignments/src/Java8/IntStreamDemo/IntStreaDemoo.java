package Java8.IntStreamDemo;

import java.util.IntSummaryStatistics;
import java.util.Optional;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class IntStreaDemoo {

    public static void main(String[] args) {

        //Adance streams
        IntStream stream= IntStream.of(1,2,3,4,5,6,7,8,9);
        int sum= stream.sum();
        System.out.println("Int stream SUM: "+sum);

        //
        Stream<Integer>  intsum=Stream.of(1,2,3,4,5,6,7,8,9);
        int  sum1= intsum.reduce(0,(i, j)->i+j);
        System.out.println("Normal stram sum: "+sum1);

        //Once the stream is created it does not reused once again,
        //Thats y we created one more stream
        IntStream stream1= IntStream.of(1,2,3,4,5,6,7,8,9);
       IntSummaryStatistics intSummaryStatistic=stream1.summaryStatistics();
        System.out.println(intSummaryStatistic);


    }
}
