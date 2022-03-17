package chapterTwo;

import java.util.Scanner;


public class DivisibleByThree{
public static void main(String[] args){
   Scanner input = new Scanner(System.in);

    System.out.println("Enter integer 1");
    int integer1 = input.nextInt();

    if ( integer1 % 3 == 0){
    System.out.println(integer1 + "is divisible by 3 ");
    }
    if (integer1 % 3 != 0){
    System.out.println( integer1 + " is not divisible by 3 ");
    
    
    }






}
}
