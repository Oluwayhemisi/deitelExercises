package chapterSeven;

import java.util.Scanner;

public class MuiltiDimenArray {
    private static int[][] array;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of rows: ");
        int rows = input.nextInt();

        System.out.println("enter the number of columns: ");
        int column = input.nextInt();

        array = new int[rows][column];
        int sum = 0;

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.println("Enter student grade: ");
                array[i][j] = input.nextInt();
                sum += array[i][j];

            }
        }
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.printf("%3d   ",array[i][j]);
            }
            System.out.println();
        }
    }
}