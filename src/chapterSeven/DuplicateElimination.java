package chapterSeven;

import java.security.SecureRandom;
import java.util.Scanner;

public class DuplicateElimination {
   private static Scanner input = new Scanner(System.in);
    private static int[] arrayValue;
    private static int [] array = new int[10];
    private static SecureRandom secureRandom = new SecureRandom();

    public static void main(String[] args) {


        for (int i = 0; i < array.length; i++) {
            array[i] = -1;
            System.out.println("Enter number: ");
            int value = secureRandom.nextInt(10,100);



        }
    }


}
