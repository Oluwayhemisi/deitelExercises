package HackerRankSolutions;

import java.util.ArrayList;
import java.util.List;

public class SumOfAnArray {
    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>();
        arr.add(4);
        arr.add(6);
        arr.add(2);
        arr.add(4);

        System.out.println(sumArray(arr));



    }

    public static int sumArray(List<Integer> arry){
        int result = arry.stream().reduce(Integer::sum).get();
        return result;

    }
}
