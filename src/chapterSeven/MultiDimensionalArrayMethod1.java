package chapterSeven;

import java.util.Scanner;

public class MultiDimensionalArrayMethod1 {
    private static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        int[][] arrays =new int [2][2];
        int total = 0;


        for (int i = 0; i < arrays.length; i++) {
            int sum = 0;
            for (int j = 0; j < arrays[i].length; j++) {
                System.out.print("enter a number: ");
                arrays[i][j] = input.nextInt();
                sum += arrays[i][j];
                total += arrays[i][j];
            }
            System.out.println("the sum for each row is:"+ sum);

        }
        System.out.println("the total of the array is: "+total);
    }
}
