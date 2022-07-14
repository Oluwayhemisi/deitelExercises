package chapterSix;

import java.security.SecureRandom;
import java.util.Scanner;

public class ComputerAssistedInstruction {
    static Scanner scanner = new Scanner(System.in);
    static SecureRandom secureRandom = new SecureRandom();
    static  int num1 =0;
    static  int num2 =0;
    static int result = 0;

    public static void inputInteger(){
        for (int i = 0; i < 12; i++) {
            num1 = secureRandom.nextInt(1,12);
            num2 = secureRandom.nextInt(1,12);


            multiply(num1,num2);
            int product = num1 * num2;


            if(result == product){
                System.out.println("Very good!");

            }
            else{
                System.out.println("No. please Try again");
                multiply(num1,num2);

            }
        }



    }


    public static void multiply(int number1, int number2) {
        System.out.println("How much is "+number1 +" times "+ number2+":");
        result = scanner.nextInt();


    }

    public static void main(String[] args) {
        inputInteger();

    }
}
