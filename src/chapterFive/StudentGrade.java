package chapterFive;

import java.util.Scanner;

public class StudentGrade {
    public static void main(String[] args) {
        int countA = 0;
        int countB = 0;
        int countC = 0;
        int countD = 0;

        Scanner input = new Scanner(System.in);


        int gradeCounter = 0;
        for (; gradeCounter <= 5; gradeCounter++) {

            System.out.println("Enter student name: ");
            String studentName = input.nextLine();

            System.out.println("Enter student grades: ");
            String studentGrades = input.nextLine();

            switch(studentGrades.toUpperCase()){
                case "A":
                    countA++;
                    break;
                case "B":
                    countB++;
                    break;
                case "C":
                    countC++;
                    break;
                case"D":
                    countD++;
                    break;
            }

        }

        System.out.println("The number of students with grades A is " + countA);
        System.out.println("The number of students with grades B is  " + countB);
        System.out.println("C " + countC);
        System.out.println("D " + countD);
    }
}
