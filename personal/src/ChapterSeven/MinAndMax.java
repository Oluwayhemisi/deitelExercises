package ChapterSeven;

import java.util.Scanner;

public class MinAndMax {
    private static Scanner input = new Scanner(System.in);
    private static int[] array;
    public static void main(String[] args) {
        System.out.println("enter count");
        int count = input.nextInt();


        int[] getFinal = readIntegers(count);
        int returnedMin = findMin(getFinal);
        System.out.println("min is: "+returnedMin);

    }
    public static int[] readIntegers(int count){
        array= new int[count];
        for (int i = 0; i < array.length ; i++) {
            System.out.print("Enter a number");
            array[i] = input.nextInt();

        }
        return array;
    }

    public static int findMin(int [] array){
        int minimum = Integer.MAX_VALUE;
        int sum=0;
        for (int i = 0; i < array.length; i++) {
        int value = array[i] ;
         if(value < minimum){
             minimum = value;
         }
        }
       return minimum;
    }

}
