package chapterTwo;
import java.util.Scanner;

public class DivisibleOfThree {
        public static void main(String[] args){
            Scanner input = new Scanner(System.in);

            System.out.println("Enter an integer ");
            int integer = input.nextInt();

            if ( integer % 3 == 0) {
                System.out.println(integer + " is divisible by 3");
            }
                if (integer % 3 != 0){
                    System.out.println( integer + " is not divisible by 3");
                }

        }
}
