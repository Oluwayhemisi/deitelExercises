package chapterFour;

import java.util.Scanner;

public class GasMileage {

    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        double total = 0;
        int litres = 0;
        int counter = 0;
        int kilometer = 1;
        while (kilometer != -1) {
            System.out.println("Enter a number for miles driven ");
            kilometer = input.nextInt();
            if (kilometer != -1) {

                System.out.println("Enter a number for gallon used for each tankful");
                litres = input.nextInt();

                total = total + (kilometer / litres);
                counter++;
            }
        }
        System.out.println("the total miles per gallon is : " +total);
    }
}
