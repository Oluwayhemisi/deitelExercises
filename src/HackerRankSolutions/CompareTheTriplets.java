package HackerRankSolutions;

import java.util.ArrayList;
import java.util.List;

public class CompareTheTriplets {
    public static void main(String[] args) {
        List<Integer> array = new ArrayList<>();
        array.add(6);
        array.add(2);
        array.add(1);

        List<Integer> array2 = new ArrayList<>();
        array2.add(3);
        array2.add(2);
        array2.add(4);
        System.out.println(compareTriplet(array,array2));
    }
    public static List<Integer> compareTriplet(List<Integer> arr1, List<Integer> arr2){

       int awardArr1 = (arr1.get(0) > arr2.get(0) ? 1 : 0) + (arr1.get(1) > arr2.get(1) ? 1 : 0) + (arr1.get(2) > arr2.get(2) ? 1 : 0);
       int awardArr2 = (arr2.get(0) > arr1.get(0) ? 1 : 0) + (arr2.get(1) > arr1.get(1) ? 1 : 0) + (arr2.get(2) > arr1.get(2) ? 1 : 0);
         List<Integer> result = new ArrayList<>();
         result.add(awardArr1);
         result.add(awardArr2);
         return result;
    }
}
