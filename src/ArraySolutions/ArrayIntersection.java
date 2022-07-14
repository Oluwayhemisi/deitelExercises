package ArraySolutions;

import java.util.Arrays;

public class ArrayIntersection {
//   static int[] newArray;
    public static void main(String[] args) {
        int[] arr1 = {2,4,7,8,3,2};
        int[] arr2 = {9,1,2,5,6,3};
        intersectionArray(arr1,arr2);

    }

    public static void intersectionArray(int[] array, int[] array2){
        int count = 0;
         int[] newArray = new int[6];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array2.length; j++) {
                if(array[i] == array2[j]){
                    newArray[count] = array[i];
                    count ++;
                }
            }
        }
        System.out.println(Arrays.toString(newArray));
    }
}
