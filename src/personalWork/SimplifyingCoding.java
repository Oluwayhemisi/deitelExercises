package personalWork;

import java.util.Scanner;

public class SimplifyingCoding {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String [] months = {"January","February","March","April","May","June","July","August","September","October","November","December"};
        System.out.println("Enter the month number(from 1 to 12");
        int monthNumber = input.nextInt();

//        int getMonth = Integer.parseInt(months[monthNumber - 1]);

        System.out.println("The month is: "+months[monthNumber-1]);
    }
}
