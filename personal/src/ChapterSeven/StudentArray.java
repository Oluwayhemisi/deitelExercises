package ChapterSeven;

import java.util.Scanner;

public class StudentArray {
    private static int[][] grades;
//    private static int[] totals;
    private static int sum = 0;
    private static int student;
    private static int courses;
    private static int highest;
    private static final Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter number of student: ");
        student = input.nextInt();

        System.out.println("Enter number of courses: ");
        courses = input.nextInt();


        grades = new int[student][courses];
        outputGrades();
        columnHeader();
        getGrades();



    }

    public static void outputGrades() {
        for (int i = 0; i < grades.length; i++) {
            sum = 0;
            for (int j = 0; j < grades[i].length; j++) {
                System.out.println("Enter a grade:  ");
                grades[i][j] = input.nextInt();
                sum += grades[i][j];
            }
        }
    }

    public static void columnHeader() {
        repeat();
        System.out.print("Student   ");
        for (int i = 0; i < courses; i++) {
            System.out.print("courses" + (i + 1) + "  ");
        }
        System.out.print("Total  Average  ");
        System.out.println();
        repeat();
    }

    public static void getGrades() {
        double average = 0;
        for (int i = 0; i < grades.length; i++) {
            int total = 0;
            System.out.print("student" + (i + 1));
            for (int j = 0; j < courses; j++) {
                System.out.printf("%9d ", grades[i][j]);
                total += grades[i][j];
//                totals[2] += total;
                average = total /(courses*1.0);

            }
            System.out.print("    " + total + "    ");
            System.out.print(average);
//            System.out.print(totals[0]);
            System.out.println();

        }
        repeat();
        repeat();

        System.out.println("SUBJECT SUMMARY  ");
        System.out.println("SUBJECT 1");
        System.out.println("The highest Scoring student is: " + highest);
    }

    public static void repeat() {
        String shape = "=";
        shape.repeat(70);
        System.out.println(shape.repeat(70));
    }

    public static void summaries(int[] totally) {
        int highest = 0;
        highest = totally[0];
        for (int i = 0; i < totally.length; i++) {
            if ( totally[i] >highest){
                highest = totally[i];

            }

        }







        }

    }

