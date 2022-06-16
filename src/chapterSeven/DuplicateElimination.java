package chapterSeven;

import java.util.Arrays;
import java.util.Scanner;

public class DuplicateElimination {
   private static Scanner input = new Scanner(System.in);
    private static int [] array = new int[10];

    public static void main(String[] args) {
        initializeArray(array);
        printArray();
        inputNumbers();
        processArray();
        printArray();
    }



    public static void initializeArray(int [] template){
        Arrays.fill(template,0,template.length,-1);
    }
    public static void inputNumbers(){
        for (int i = 0; i < array.length; i++) {
            System.out.println("Enter a number");
             int number = input.nextInt();
            array[i] = number;
        }
    }

    public static void processArray(){
        int count;
        int temp = 0;
        for (int i = 0; i < array.length; i++) {
            count = 0;

            for (int j = 0; j < array.length; j++) {
                if(array[i] == array[j]){
                    temp = j;
                    count++;}
                }
            if(count > 1){
                int number = enterAnotherNumber(array[i]);
                while(number == array[i]){
                    number = enterAnotherNumber(array[i]);
                }
                array[temp] = number;
            }
            }
        }

    public static int enterAnotherNumber(int repeatedNumber){
        System.out.println(repeatedNumber+ " already exist! \n Enter another number");
        return input.nextInt();
    }

    public static void printArray(){
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }



}
