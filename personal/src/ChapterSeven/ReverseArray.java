package ChapterSeven;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseArray {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
       int [] arrayList = {1,2,3,4,5};
        System.out.println("Array ="+ Arrays.toString(arrayList));

        reverse(arrayList);
        System.out.println("Reversed Array ="+ Arrays.toString(arrayList));

    }

    private static void reverse(int[] array){
       int maxLength = array.length-1;
       int halfLength = array.length / 2;
        for (int i = 0; i < halfLength; i++) {
            int temp = array[i];
            array[i] = array[maxLength-i];
            array[maxLength-i] = temp;

        }

        }

    }

