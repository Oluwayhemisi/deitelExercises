package chapterTwo;

import java.util.Scanner;

public class ArithmeticOne {
 public static void main(String[] args) {
  Scanner input = new Scanner(System.in);
  System.out.print("enter number 1");
  int number1 = input.nextInt();

  System.out.print("enter number 2");
  int number2 = input.nextInt();

  System.out.print("enter number 3");
  int number3 = input.nextInt();

  System.out.print("enter number 4");
  int number4 = input.nextInt();

  int sum = number1 + number2 + number3 + number4;

  System.out.printf("the addition of %d, %d, %d and %d is: %d", number1, number2, number3, number4, sum);


 }
}

















































