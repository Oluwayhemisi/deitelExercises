package chapterTwo;

import java.util.Scanner;

public class FiveIntegers {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter number1 ");
        double number1 = input.nextDouble();

        System.out.print("Enter number2 ");
        double number2 = input.nextDouble();

        System.out.print("Enter number3 ");
        double number3 = input.nextDouble();

        System.out.print("Enter number4 ");
        double number4 = input.nextDouble();

        System.out.print("Enter number5 ");
        double number5 = input.nextDouble();

        double largest = number1;

        if (number2 > largest) {
            largest = number2;
        }

        if (number3 > largest) {
            largest = number3;
        }

        if (number4 > largest) {
            largest = number4;
        }


        if (number5 > largest) {
            largest = number5;

        }

        System.out.println("Largest number is " + largest);

        double smallest = number1;

        if (number2 < smallest) {
            smallest = number2;
        }

        if (number3 < smallest) {
            smallest = number3;
        }
        if (number4 < smallest) {
            smallest = number4;
        }
        if (number5 < smallest) {
            smallest = number5;
        }
        System.out.println("Smallest number is " + smallest);


    }
}
