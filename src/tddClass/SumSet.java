package tddClass;

import java.util.ArrayList;

public class SumSet {

    ArrayList<Integer> totalArray = new ArrayList<>();

    public int addDistinctElement(int[] array1, int[] array2) {
        int sum1 = 0;
        int sum2 = 0;
        int totalSum = 0;

        for (int i = 0; i < array1.length; i++) {
            int counter = 0;
            for (int j = 0; j < array2.length; j++) {
                if (array1[i] != array2[j]) {
                    counter++;
                }
            }
            if (counter == array2.length) {
                sum1 = sum1 + array1[i];
            }
        }

        for (int j = 0; j < array2.length; j++) {
            int counter = 0;
            for (int i = 0; i < array1.length; i++) {
                if (array2[j] != array1[i]) {
                    counter++;
                }
            }
            if (counter == array1.length) {
                sum2 = sum2 + array2[j];
            }
            totalSum = sum1 + sum2;

        }
        return totalSum;

    }
 }



