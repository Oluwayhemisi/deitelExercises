package ArraySolutions;

import java.util.Arrays;

public class SelectionSort {
    public static void selectSort(int[] arr){
        for (int i = 0; i < arr.length-1; i++) {
            int container = i;
            for (int j = i +1; j < arr.length; j++) {
                if(arr[j] < arr[container]){
                    container = j;
                }

            }
            int temp = arr[i];
            arr[i] = arr[container];
            arr[container] = temp;

        }
        System.out.println(Arrays.toString(arr));

    }

    public static void main(String[] args) {
        int[] array = {2,0,1,0,3,8};
        selectSort(array);
    }
}
