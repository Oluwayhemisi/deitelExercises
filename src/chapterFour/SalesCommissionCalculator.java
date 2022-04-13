package chapterFour;

import java.util.Scanner;

public class SalesCommissionCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int item = 0;
        double earning = 0;
        double value = 0;
        for (int i = 0; i < 4; i++) {
            System.out.println("Enter the number of items");
            item = input.nextInt();

            System.out.println("Enter values of the items");
            value = input.nextDouble();

            earning = (200+(0.9 * value));
            System.out.println("the salesperson's earning is: "+earning);
        }

    }

}
