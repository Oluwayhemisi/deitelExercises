package HackerRankSolutions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MiniMaxSum {
    public static void main(String[] args) {
        List<Integer> sample = new ArrayList<>();
        sample.add(1);
        sample.add(3);
        sample.add(5);
        sample.add(7);
        sample.add(9);

        System.out.println(Arrays.toString(minMaxSum(sample)));
    }
    public static long[] minMaxSum(List<Integer> arr){
        long sumTotal = arr.stream().mapToLong(x->x).sum();
        long min = arr.stream().mapToLong(x->x).min().getAsLong();
        long max = arr.stream().mapToLong(x->x).max().getAsLong();

        long maxTotal = sumTotal - min;
        long minTotal = sumTotal - max;
        System.out.print(minTotal+" ");
        System.out.print(maxTotal);

        long [] result = new long[2];
        result[0] = maxTotal;
        result[1] = minTotal;

       System.out.println(minTotal+maxTotal);
       System.out.println(minTotal);
        return result;
    }
}
