package chapterFive;

import java.util.Scanner;

public class Multiplication {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int multiply = 0;
        System.out.print("Enter a number");
        int num = input.nextInt();


        for (int i = 1; i <= 12 ; i++) {
            multiply = i * 2;
            System.out.println("2 X " + i +" = " +multiply);
        }
    }
}
