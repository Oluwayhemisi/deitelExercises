package ArraySolutions;

import java.util.Arrays;

public class QuestionTwo {

    public static void moveZero(int[] array){
        for (int i = 0; i < array.length-1; i++) {
            for (int j = i; j+1 < array.length; j++) {
                if(array[j] > array[j+1]){
                    if(array[j + 1] == 0){
                        int temp = array[j];
                        array[j] = array[j+1];
                        array[j+1] = temp;
                    }
                }

            }

        }
        System.out.println(Arrays.toString(array));
    }

    public static void main(String[] args) {
        int [] nums = {0,2,0,3,4,0,7,0,1};
//        moveZero(nums);
        moveBack(nums);
    }
    public static void moveBack(int[] arr){
            int count = 0;
        for (int i = 0; i < arr.length-1; i++) {
            if(arr[i] != 0){
                arr[count] = arr[i];
                count++;
            }
            if(arr[i] == 0){

            }
        }
        System.out.println(Arrays.toString(arr));

        }




}
