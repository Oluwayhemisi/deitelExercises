package chapterSeven;

import java.util.Scanner;

public class StudentArray {
    private static int firstPosition = 0;
    private static int secondPosition = 0;
    private static int courses = 0;
    private static int students = 0;
    //    private static int[][] grades = new int[students][courses];
    private static int maximum = 0;
    private static int minimum = 0;
    public static Scanner input = new Scanner(System.in);
    public static int[][] grades = new int[students][courses];
    private static int failure = 0;
   private static int passed = 0;


    public static void main(String[] args) {

        System.out.println("How many Students are in the class");
        students = input.nextInt();

        System.out.println("How many courses are they taking ");
        courses = input.nextInt();

    }
        public static void inputGradesAndGradesRange() {
            for (int row = 0; row < students; row++) {
                for (int column = 0; column < courses; column++) {
                    System.out.println("Enter a grade ");
                    grades[row][column] = input.nextInt();

                    if (grades[row][column] > 0 && grades[row][column] < 50) {

                        failure++;
                    }

                    if (grades[row][column] > 50 && grades[row][column] < 100) {
                        passed++;

                    }
                }
            }
        }
        public static void printColumnHeader(){
        printShape();
        System.out.print("         " + "course1");
        for (int row = 0; row < 1; row++) {
            for (int column = 1; column < courses; column++) {

                System.out.print("  " + "course" + (column + 1));
            }
            System.out.print("   total   average   position");
            System.out.println();
            printShape();

        }


        for (int row = 0; row < students; row++) {
            System.out.print("student" + (row + 1) + "  ");
            int total = 0;
            double average = 0;
            for (int column = 0; column < courses; column++) {
                total += grades[row][column];
                average = (double) total / (double) courses;

                if (grades[row][column] > maximum) {
                    maximum = grades[row][column];


                }
                if (grades[row][column] < minimum) {
                    minimum = grades[row][column];

                }
                System.out.print(grades[row][column] + "      ");
            }
            System.out.print("    " + total);
            System.out.printf("     %.2f", average);
//            System.out.print("        " + firstPosition);
//            System.out.print("        "+secondPosition);
            System.out.println();

        }
        System.out.println("the easiest " + "passed " + passed);
        System.out.println("the hardest " + "failure " + failure);

    }
    public static void printShape(){
        String shape = "=";
        System.out.print(shape.repeat(80));
        System.out.println();
    }
}




