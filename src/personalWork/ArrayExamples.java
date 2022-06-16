package personalWork;

import java.util.Scanner;

public class ArrayExamples {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of items: ");
        int n = input.nextInt();

        double [] number = new double[n];
        int sum = 0;
        System.out.println("Enter the numbers: ");

        for (int i = 0; i < n; i++) {
            number[i] = input.nextInt();
            sum += number[i];

        }
        System.out.println(("the sum of the item is: "+sum));

        double average = (double) sum/n;
        int count = 0;
        for (int i = 0; i < n; i++) {
            if( number[i] > average){
                count ++;
            }
        }
        System.out.println("Average is: "+average);
        System.out.println("Number of elements above the average  is: "+count);

    }
}
