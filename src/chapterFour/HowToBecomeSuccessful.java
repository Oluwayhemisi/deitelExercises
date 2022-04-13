package chapterFour;

import java.util.Scanner;

public class HowToBecomeSuccessful {


    public static void main(String[] args) {
         String createGoals = "createGoals";
         String takeSmartRisks = "takeSmartRisks";
         String committed = "committed" ;
         String hardworking = "hardworking";
         String thinkPositive = "thinkPositive" ;

        Scanner input = new Scanner(System.in);

        for (int i = 1; i <=5 ; i++) {

            System.out.println("How to become successful ");
            String you = input.nextLine();
            if ((you.equals(createGoals))||you.equals(takeSmartRisks)||you.equals(committed)||you.equals(hardworking)||you.equals(thinkPositive)){
                System.out.println("you will become successful" );
            }
            else {
                System.out.println("it might take the grace of God to be successful");
            }

        }


    }
}
