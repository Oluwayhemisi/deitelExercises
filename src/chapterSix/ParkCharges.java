package chapterSix;

import java.util.Scanner;

public class ParkCharges {
  private static  double charges = 2.00;
  private  static int hour = 0;
  private int total;
    public static void main(String[] args) {
//        ParkCharges parkCharges = new ParkCharges();
//        parkCharges.calculateHours();
////        parkCharges.collectAllMethod();

        calculateHours();

    }

        public static void calculateHours(){
            Scanner input = new Scanner(System.in);
            for (int i = 0; i <= 4 ; i++) {
                System.out.println("Enter the number of hours");
                 hour = input.nextInt();
                collectAllMethod();

            }


        }
        public static void calculateForThreeHoursParking(){
        if (hour > 1 && hour <= 3){
            charges = 2.00;
            System.out.println("The Charges For Three hour is: "+charges);
        }
        }
    public static void calculateForExtraHours(){
        if (hour > 3 && hour <= 23){
            double extraCharges = charges + 0.50;
            System.out.println("The charges for exceeding hours is: "+extraCharges);
        }
    }
    public static void calculateForTwentyFourHours() {
        if (hour == 24) {
            double maximumCharges = 10.00;
            System.out.println("The maximum charges is: " + maximumCharges);
        }
    }
        public static String collectAllMethod(){
            calculateForThreeHoursParking();
            calculateForExtraHours();
            calculateForTwentyFourHours();
            return null;
        }


    }

