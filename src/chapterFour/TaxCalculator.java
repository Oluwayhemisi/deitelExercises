package chapterFour;

import java.util.Scanner;

public class TaxCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double totalTax = 0;
        int maxEarned = 30000;

        for (int i = 1; i <= 3; i++) {
            System.out.println("Enter citizen's name");
            String name = input.nextLine();

            System.out.println("Enter citizens earning");
            int earning = input.nextInt();
            input.nextLine();


            if(earning <= maxEarned){
                totalTax = 0.15 * maxEarned;
                System.out.println("the citizen's total tax is: " +totalTax);
            }

            else {
                totalTax = 0.20 * maxEarned;

                System.out.println("the citizen's exceeded tax is:  "+totalTax);
            }

        }



    }
}
