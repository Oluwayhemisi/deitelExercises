package chapterSeven;

import java.util.Scanner;

public class StudentArray {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("How many Students are in the class");
        int students = input.nextInt();

        System.out.println("How many courses are they taking ");
        int courses = input.nextInt();

        int[][] grades = new int[students][courses];


        for (int row = 0; row < students; row++) {
            for (int column = 0; column < courses; column++) {
                System.out.println("Enter a grade ");
                grades[row][column] = input.nextInt();
//                total += grades[row][column];


            }
        }
//        for (int row = 0; row < students; row++) {
//
//            for (int column = 0; column < courses; column++) {
//                total += grades[row][column];
//                System.out.println(total);
//            }
//        }

        System.out.print("         " + "course1");
        for (int row = 0; row < 1; row++) {
            for (int column = 1; column < courses; column++) {

                System.out.print("  " + "course" + (column + 1));
            }
            System.out.print("   total   average");
            System.out.println();

        }

        for (int row = 0; row < students; row++) {
            System.out.print("student" + (row + 1) + "  ");
            int total = 0;
            double average = 0;
            for (int column = 0; column < courses; column++) {
                total += grades[row][column];
                average = (double) total / (double) courses;
                System.out.print(grades[row][column] + "      ");


            }
            System.out.print("  " + total);
            System.out.print("        " + average);
            System.out.println();

        }
        for (int row = 0; row < students; row++) {
            for (int column = 0; column < courses; column++) {
                int maximum = 0;
                int minimum = 0;
                if ( grades[row][column] > maximum) {
                     maximum = grades[row][column] ;
                } else { minimum = grades[row][column];
                }

                System.out.println(" the maximum value is: " + maximum+ "\n the minimum value is: " + minimum);


            }
        }
//
//    int firstnumber= 4;
//    int thirdnumber= 5;
//    int secondnumber= 8;
//    int maximum = Math.max(Math.max(firstnumber,thirdnumber), secondnumber);
//        System.out.println(maximum);

    }


}

