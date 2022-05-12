package chapterSeven;

import java.util.Scanner;

public class SumArray {
    private static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        int total = 0;
        int [] numbers = {1,2,3,4};
        for (int i = 0; i < numbers.length; i++) {
            total += numbers[i];

        }
        System.out.println("the total of the Array is:  "+total);




//        int numbers = getNumbers(5);
//        System.out.println("the total is: "+numbers);

        }


// public static int getNumbers(int number){
//        int total = 0;
//        int[] value = new int[number];
//
//     for (int i = 0; i < number; i++) {
//         System.out.println("Enter an integer");
//         value[i] = input.nextInt();
//
//         total += value[i];
//     }
//     return total;
//
//        }
    }

