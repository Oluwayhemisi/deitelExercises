package chapterTwo;

import java.util.Scanner;

public class ComparingIntegers{
  public static void main(String[] args){
  Scanner input = new Scanner(System.in);
  System.out.println("Enter number1" );
  int number1 = input.nextInt();
  int number2 = number1 * number1;
  int number3 = 100;

  if (number1 > number3){
System.out.println("number1 is greater than" +number3);
}
 if (number2 > number3){
System.out.println("number2 is greater than" +number3);
}
 if (number1 < number3){
System.out.println("number1 is less than" +number3);
}
if (number2 < number3){
System.out.println("number2 is less than" +number3);
}
 if (number1 == number3){
System.out.println("number1 is equal to" +number3);
}
 if (number2 == number3){
System.out.println("number2 is equal to" +number3);
}


 if (number1 != number3){
System.out.println("number1 is not equal to" +number3);
}
 if (number2 != number3){
System.out.println("number2 is not equal to" +number3);
}














 }
}
