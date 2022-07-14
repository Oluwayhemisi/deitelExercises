package chapterFourteen;

import java.util.Scanner;

public class StaticCharMethods2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("please Enter a radix");
        int radix = scanner.nextInt();

        System.out.println("""
                please choose one:
                1- convert digit to character
                2- convert character to digit
                """);
        int choice = scanner.nextInt();

        switch (choice){
            case 1:
                System.out.println("Enter a digit: ");
                int digit = scanner.nextInt();
                System.out.println(Character.forDigit(digit,radix));
                break;
            case 2:
                System.out.println("Enter a character: ");
                char character  = scanner.next().charAt(0);
                System.out.println(Character.digit(character,radix));
                break;
        }
    }
}
