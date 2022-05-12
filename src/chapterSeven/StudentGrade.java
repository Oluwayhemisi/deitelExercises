package chapterSeven;

import java.util.Scanner;

public class StudentGrade {
    public static Scanner input = new Scanner(System.in);
    private static int students = 0;
    private static int courses = 0;
    public static int[][] grades;

    public static void main(String[] args) {
        getNumberOfstudentAndScores();
        getGrades();
        columnHeader();
        outputGrades(grades);

    }

    public static void getNumberOfstudentAndScores() {
        System.out.println("Enter number of student");
        students = input.nextInt();

        System.out.println("Enter the courses offered");
        courses = input.nextInt();

        grades = new int[students][courses];


    }

    public static void getGrades() {
        for (int i = 0; i < students; i++) {
            for (int j = 0; j < courses; j++) {
                System.out.println("Enter grade");
                grades[i][j] = input.nextInt();
            }
        }
//        for (int i = 0; i < grades.length; i++) {
//            for (int j = 0; j < students; j++) {
//                System.out.print("     " + grades[i][j]);
//            }
//        }
    }

    public static void columnHeader() {
        System.out.print("STUDENT    ");
        for (int j = 1; j <= courses; j++) {
                System.out.print("courses"+(j)+"   ");
            }
        System.out.println();
        }


    public static void outputGrades(int[][]grades) {
        for (int i = 0; i < students; i++) {
            System.out.print("Student"+(i+1)+"   ");

            for (int j = 0; j < courses; j++) {
                System.out.print(grades[i][j]+"   ");
            }
            System.out.println();
        }
    }
}