package HackerRankSolutions;

import java.util.ArrayList;
import java.util.List;

public class DivisibleSumPairs {
    public static int divisibleSumPair(int n, int k, List<Integer> ar){
        int count = 0;
        for (int i = 0; i < ar.size(); i++) {
            for (int j = 0; j < i; j++) {
                    if( (ar.get(i) + ar.get(j)) % k  == 0) {
                        count++;
                    }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(3);
        arr.add(2);
        arr.add(6);
        arr.add(1);
        arr.add(2);
//        System.out.println(arr);
        System.out.println(divisibleSumPair(6,3,arr));
    }
}
