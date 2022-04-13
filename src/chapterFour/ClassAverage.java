 package chapterFour;

import java.util.Scanner;

public class ClassAverage {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int total = 0;
        int i = 0;
//        while(i <=10){
//            System.out.println("Enter grade ");
//            int grade = input.nextInt();
//            total = total + grade;
//            i++;
//        }
//
//        int average = total / 10;
//        System.out.println("Total of all 10 grades is "+ total);
//        System.out.println("Class average is "+average);

        System.out.print("Enter a grade or -1 to quit");
        int number = input.nextInt();


        while( i != -1);
        total = total + i;
        i++;

        System.out.print("The total is" +total);



    }
}