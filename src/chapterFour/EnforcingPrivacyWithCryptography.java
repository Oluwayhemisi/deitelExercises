package chapterFour;

import java.util.Scanner;

public class EnforcingPrivacyWithCryptography {
    static Scanner scanner = new Scanner(System.in);

    public static void encrypt(){
        System.out.println("Enter a four digit");
        int integer = scanner.nextInt();

        int getInteger = (integer + 7) % 10;


    }
}
