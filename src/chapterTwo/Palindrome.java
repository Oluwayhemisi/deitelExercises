package chapterTwo;

import java.util.Scanner;

public class Palindrome {
        public static void main(String[] args){
            Scanner input = new Scanner(System.in);
            System.out.println("enter a five digits");
            int firstNumber = input.nextInt();
            int number1 = firstNumber / 10000;
            int number2 = (firstNumber % 10000) / 1000;
            int number3 = (firstNumber % 1000) / 100;
            int number4 = (firstNumber % 100) / 10;
            int number5 = (firstNumber % 10);



            int numb = ( number5 * 10000) + (number4 * 1000) + (number3 * 100) + (number2 * 10) + (number1 * 1);

            if (firstNumber == numb ) {
                System.out.println( firstNumber+ " is palindrome" );
            }

            if (firstNumber != numb) {
                System.out.println(firstNumber+ "is not a palindrome");
            }


        }


    }
