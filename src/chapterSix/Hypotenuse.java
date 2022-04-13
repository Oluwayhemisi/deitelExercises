package chapterSix;

import java.util.Scanner;

public class Hypotenuse {
    private static double hypotenuse = 0.0;
    private static double total = 0.0;
//    private static double firstNumber =0.0;
//    private static double secondNumber =0.0;
    public static void main(String[] args) {
        Hypotenuse number = new Hypotenuse();
        number.HypotenuseCalculations();

    }
    public void HypotenuseCalculations(){
        Scanner input =new Scanner(System.in);

        for (int i = 1; i <= 3 ; i++) {
            System.out.println("Enter the firstNumber: ");
            double firstNumber = input.nextDouble();

            System.out.println("Enter the secondNumber:  ");
           double secondNumber = input.nextDouble();

             total = Math.pow( firstNumber,2) + Math.pow(secondNumber,2);

            hypotenuse = Math.sqrt(total);


        }

    }
}
