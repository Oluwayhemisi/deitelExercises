package chapterTwo;

import java.util.Scanner;

public class Palindrome {
        public static void main(String[] args){
            Scanner input = new Scanner(System.in);
            System.out.println("enter a five digits");
            int number = input.nextInt();
            int number1 = number / 10000;
            int number2 = (number % 10000) / 1000;
            int number3 = (number % 1000) / 100;
            int number4 = (number % 100) / 10;
            int number5 = (number % 10);



            int totalNumber = ( number5 * 10000) + (number4 * 1000) + (number3 * 100) + (number2 * 10) + (number1 * 1);

            if (number == totalNumber ) {
                System.out.println( number+ " is palindrome" );
            }

            if (number != totalNumber) {
                System.out.println(number+ "is not a palindrome");
            }


        }


    }
