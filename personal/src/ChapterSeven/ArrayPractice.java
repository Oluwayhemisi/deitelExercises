package ChapterSeven;


import java.util.Scanner;

public class ArrayPractice{
    private static Scanner input = new Scanner(System.in);


    public static void main(String[] args) {
      int[] myArray = getIntegers(5);
      int[] sortArray = sortIntegers(myArray);
      printArray(sortArray );

    }
    public static int[] getIntegers(int capacity){
        int[] array = new int[capacity];
        System.out.println("Enter"+ capacity);
        for (int i = 0; i < array.length; i++) {
            array[i] = input.nextInt();
        }
        return array;
    }

    public static void printArray(int[] array){
        for (int i = 0; i < array.length; i++) {
            System.out.println("Element" + i + "in" +array[i]);

        }
    }

    public static int[] sortIntegers(int[] array){
        int[] sortedArray = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            sortedArray[i] = array[i];
        }
        boolean flag = true;
        int temp = 0;
        while(flag){
            flag = true;
            for (int i = 0; i < array.length ; i++) {
                if(sortedArray[i] < sortedArray[i + 1]){
                    temp = sortedArray[i];
                    sortedArray[i] = sortedArray[i +1];
                    sortedArray[i+1] = temp;
                    flag = true;
                }
            }

        }
        return sortedArray;
    }
}
