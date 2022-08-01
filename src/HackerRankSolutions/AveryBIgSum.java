package HackerRankSolutions;

import java.util.ArrayList;
import java.util.List;

public class AveryBIgSum {

    public static void main(String[] args) {
        List<Long> array = new ArrayList<>();
        array.add(1000000001L);
        array.add(1000000002L);
        array.add(1000000003L);
        array.add(1000000004L);
        array.add(1000000005L);
        System.out.println(bigSum(array));
    }
    public static long bigSum(List<Long> num){
        long result = num.stream().reduce(0L,Long::sum);
        return result;
    }
}
