package chapterEleven;

import java.util.InputMismatchException;
import java.util.Scanner;

public class DivisionByZero {
    public static void main(String[] args) {
        int numerator = input("Enter numerator");
        int denominator = input("Enter denominator");
        try {
            int approximateQuotient = numerator/denominator;
            display(approximateQuotient+" ");
        }catch(ArithmeticException m){
            display("Undefine! ");
            display("Try again!");
        }


    }
    private static int input(String prompt){
        display(prompt);
        Scanner keyboardInput = new Scanner(System.in);
        int number = 0;
        try {
            return keyboardInput.nextInt();
        }catch (InputMismatchException ex) {
            display("I expect only integers");
            display("Try again!");
            input(prompt);

        }
        return number;
    }
    private static void display(String prompt){
        System.out.println(prompt);
    }
}
