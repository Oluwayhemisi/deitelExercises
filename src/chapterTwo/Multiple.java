package chapterTwo;

import java.util.Scanner;

public class Multiple{
public static void main(String[] args){
Scanner input = new Scanner(System.in);

    System.out.println( "Enter a number1");
    int number1 = input.nextInt();

    System.out.println("Enter a number 2");
    int number2 = input.nextInt();
    
    double tripledNumber = number1 * number1 * number1;
    double doubledNumber = number2 * number2;

    if (tripledNumber % doubledNumber == 0){
    System.out.println(tripledNumber+ " is a multiple of second number doubled ");
    }
    if (tripledNumber % doubledNumber != 0){
    System.out.println(tripledNumber+ "is not a multiple of second number doubled");
    }



    }
    }
