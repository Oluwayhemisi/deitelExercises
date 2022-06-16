package chapterEleven;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Division {
    public static void main(String[] args) {
        int numerator = input("Enter the numerator");
        int denominator = input("Enter the denominator");
        try {
            int quotient = numerator / denominator;
            display(quotient + " ");
        }catch (ArithmeticException a){
            display("undefined");
            display("Try again");
        }
    }
    public static void display(String prompt){
        System.out.println(prompt);
    }
    public static int input(String prompt){
        display(prompt);
        Scanner keyboardInput = new Scanner(System.in);
        int number = 0;
        try{
            return keyboardInput.nextInt();
        }catch (InputMismatchException e){
            display("I expect only Integers");
            display("Try again! ");
            input(prompt);
        }
        return number;
    }
}
