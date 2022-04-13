package chapterSix;

import java.util.Scanner;

public class ParkingCharge {

    double charges = 2.00;
    public static void main(String[] args) {


       Scanner input = new Scanner(System.in);
        ParkingCharge charge = new ParkingCharge();
        System.out.println("Enter a hour");


//        charge.calculateThreeHour(3);
//        charge.calculateForExceedingHours(23);
//      charge.calculateForMaximum(24);


    }
    public double calculateThreeHour(int hour){


        if(hour > 1 && hour <= 3){
             charges =  2.00;
            System.out.println("The charges for three hours is: " +charges);
            return charges ;
        }
        return 0.0;
    }
    public double calculateForExceedingHours(int hour){


        if (hour > 3 && hour < 24){
            double extraCharges = charges + 0.50;
            System.out.println("The charges for exceeding hours is: " +extraCharges);
            return extraCharges;
        }
        return 0.0;
    }

    public void calculateForMaximum(int hour) {



        if (hour == 24 ){
            double maximumCharges = 10.00;
            System.out.println("The maximum charge for 24hours is:  "+maximumCharges);
        }


    }
//    public void collectAllMethod(){
//        calculateThreeHour(0);
//        calculateForExceedingHours(0);
//        calculateForMaximum(0);
//    }

}
