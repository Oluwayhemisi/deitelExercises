package chapterTwo;

import java.util.Scanner;
public class Acceleration{
public static void main(String[] args){
Scanner input = new Scanner(System.in);

 System.out.println("Enter initialVelocity" );
 double initialVelocity = input.nextDouble();
 
 System.out.println("Enter finalVelocity" );
 double finalVelocity = input.nextDouble();

 System.out.println("Enter a number for time" );
 double time = input.nextDouble();

 double a = (finalVelocity - initialVelocity) / time;
 System.out.print ("the average acceleration is:"+a );

}
}
