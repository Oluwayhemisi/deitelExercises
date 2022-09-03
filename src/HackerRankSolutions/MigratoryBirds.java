package HackerRankSolutions;

import java.util.ArrayList;
import java.util.List;

public class MigratoryBirds {
    public static int migratoryBirds(List<Integer> arr){

        int[] count = new int[5];

        for (int i = 0; i < arr.size(); i++) {

            count[arr.get(i)-1]++;


        }

        int id = 1;
        int max = count[0];

        for(int i = 1 ; i < count.length ; i++){
            if(count[i] > max){
                max = count[i];
                id = i+1;
            }
        }

        return id;

//    }









//        int mostFrequent = 0;
//        int mostFreqMin = 0;
//        int count = 0;
//        int getNum = arr.get(0);
//        for (int i = 0; i < arr.size(); i++) {
//            for (int j = 0; j < arr.size(); j++) {
//                if (arr.get(i) == getNum) {
//                    mostFrequent = arr.get(i);
//
//                }
//            }
//
//        }
//
//       return mostFrequent;
    }

    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(1);
        arr.add(1);
        arr.add(2);
        arr.add(2);
        arr.add(2);
        arr.add(3);

//        arr.add(1);
//        arr.add(4);
//        arr.add(4);
//        arr.add(4);
//        arr.add(5);
//        arr.add(3);

        System.out.println(migratoryBirds(arr));
    }
}
