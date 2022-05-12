package chapterSeven;

import java.util.Arrays;
import java.util.Scanner;

public class Arraysss {
    public static void main(String[] args) {
        int total = 0;

        Scanner scanner= new Scanner(System.in);
        int [][] num = {{1,2,3,4,5},{2,3,4,5},{2,4},{2}};
        for (int i = 0; i < num.length; i++) {
            int sum =0;
            for (int j = 0; j < num[i].length; j++) {

                sum+= num[i][j];
            }
            System.out.println(sum);
            total+= sum;
        }
        System.out.println(total);








//another solution to find square root ofthelist

        int[] numbers = {2, 3, 4, 5, 6, 7, 9, 8};

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = numbers[i] * 2;


            System.out.println(numbers[i]);
        }





        System.out.println(Arrays.toString(numbers)); /*4, 6, 8, 10, 12, 14, 18, 16*/

    }






























}
