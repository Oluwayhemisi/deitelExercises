package ArraySolutions;

import java.util.Arrays;

public class BubbleSort {

    public static void bubbleSort(int[] array){
        for (int i = 0; i < array.length-1; i++) {
            for (int j = 0; j + 1 <array.length-i; j++) {
                if(array[j] > array[j+1]){
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }

            }
        }
        System.out.println(Arrays.toString(array));
    }

    public static void main(String[] args) {
        int [] arr = {2,3,7,9,12,44,3,0,7};
        bubbleSort(arr);
    }
}
