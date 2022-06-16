package Assignment;

import java.util.ArrayList;

public class TwoSets {
    public static void main(String[] args) {
        boolean contains = false;
        int counter = 0;
        int sum = 0;
        int collect = 0;
        int[] array = {3, 1, 7, 9};
        int[] array2 = {2, 4, 1, 9, 3};
        ArrayList <Integer> array3 = new ArrayList<>();

        checkForDistinctElement(array,array2,array3,counter);
        checkForDistinctElement(array2,array,array3,counter);
        for (int i = 0; i < array3.size(); i++) {
            sum = sum + array3.get(i);
        }
        System.out.println("Sum is "+ sum);

    }


    public static void checkForDistinctElement(int[] rowArray, int[] columnArray, ArrayList<Integer> array3, int counter){
        for (int i = 0; i < rowArray.length; i++) {
            counter = 0;
            for (int j = 0; j < columnArray.length; j++) {
                if (rowArray[i] != columnArray[j]) {
                    counter++;
                }
            }
            if(counter == columnArray.length){
                array3.add(rowArray[i]);
            }
        }

    }




}
