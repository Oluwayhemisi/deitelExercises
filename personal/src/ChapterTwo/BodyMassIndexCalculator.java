package ChapterTwo;

import java.util.Scanner;

public class BodyMassIndexCalculator {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the weight in kilogram: ");
        double weight = input.nextDouble();
        System.out.println("Enter the height in inches: ");
        double height = input.nextDouble();

        double bodyMassIndex = (weight) / (height * height);
        System.out.println("The Body Mass Index is: " + bodyMassIndex);

//        System.out.print(" Below 18.5 -----underweight \n," +
//                "18.5-24.9  ------- healthy \n" +
//                "25.0 - 29.9 -------overweight");

        if (bodyMassIndex < 18.5) {
            System.out.println("You are underweight!");
        } else if (bodyMassIndex >= 18.5 && bodyMassIndex <= 24.9) {
            System.out.println(" You are healthy!");
        } else if (bodyMassIndex >= 25.0 && bodyMassIndex <= 29.9) {
            System.out.println("You are overweight");
        } else {
            System.out.println("you are obessed");
        }
    }
}
