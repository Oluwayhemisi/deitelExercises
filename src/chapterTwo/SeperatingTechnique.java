package chapterTwo;

import java.util.Scanner;

public class SeperatingTechnique {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println(" enter five digits ");
        int firstNumber1 = input.nextInt();
        int number = firstNumber1 / 10000;
        int number2 = (firstNumber1 % 10000) / 1000;
        int number3 = (firstNumber1 % 1000) / 100;
        int number4 = (firstNumber1 % 100) / 10;
        int number5 = (firstNumber1 % 10);

        System.out.printf("the first five digits are: %d %d %d %d %d", number, number2, number3, number4, number5);
    }
}
