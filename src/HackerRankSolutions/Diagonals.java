package HackerRankSolutions;

import java.util.ArrayList;
import java.util.List;

public class Diagonals {
    public static void main(String[] args) {
        List<List<Integer>> array = new ArrayList<>();
        List<Integer> array1 = new ArrayList<>();
        List<Integer> array2 = new ArrayList<>();
        List<Integer> array3 = new ArrayList<>();
        array.add(array1);
        array.add(array2);
        array.add(array3);


        array1.add(4);
        array1.add(3);
        array1.add(2);


        array2.add(5);
        array2.add(2);
        array2.add(7);


        array3.add(-5);
        array3.add(8);
        array3.add(3);





        System.out.println(diagonalDifference(array));





    }
    public static int diagonalDifference(List<List<Integer>> arr){
        int sumTopLeftToRight = 0;
        int sumDownLeftToLeft = 0;

        for (int i = 0; i < arr.size(); i++) {
           sumTopLeftToRight += arr.get(i).get(i);
           sumDownLeftToLeft += arr.get(i).get(arr.size()- (i+1));
        }
         int subtract = sumTopLeftToRight - sumDownLeftToLeft;
        return Math.abs(subtract);
    }

}
