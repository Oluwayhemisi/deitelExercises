package ChapterTwo;

import java.util.Scanner;

public class WorldPopulationGrowthCalculator {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
//        System.out.println("Enter the world population");
//        double worldPopulation = input.nextDouble();
//
//        System.out.println("Enter the annual rate");
//        double annual = input.nextDouble();
////
//        double estimatedValueFirstYear = worldPopulation * annual;
//        System.out.println(estimatedValueFirstYear);
//
//        double estimatedValueSecondYear = (estimatedValueFirstYear *annual )  +  worldPopulation;
//        System.out.println("The estimated value for the second year is: "+ estimatedValueSecondYear);
//
//        double estimatedValueThirdYear = (estimatedValueSecondYear *annual )  +  worldPopulation;
//        System.out.println("The estimated value for the third year is: "+estimatedValueThirdYear);
//
//        double estimatedValueFourthYear = (estimatedValueThirdYear *annual )  +  worldPopulation;
//        System.out.println("The estimated value for the fourth year is: "+estimatedValueFourthYear);
//
//        double estimatedValueFifthYear = (estimatedValueFourthYear *annual )  +  worldPopulation;
//        System.out.println("The estimated value for the fifth year is: "+estimatedValueFifthYear);



        System.out.println("Enter the world population");
        double worldPopulation = input.nextDouble();

        System.out.println("Enter the annual rate");
        double annual = input.nextDouble();
        for (int i = 0; i < 5; i++) {
            worldPopulation = (worldPopulation * annual) + worldPopulation;
            System.out.printf("the population for the year %d is: %f%n", (i + 1),worldPopulation);
        }

    }
}
