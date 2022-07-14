package chapterFourteen;

import java.util.Scanner;

public class StaticCharMethod {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a character");
        String input = scanner.nextLine();
        char c = input.charAt(0);

        System.out.println(Character.isDefined(c));
        System.out.println(Character.isDefined(c));
        System.out.println(Character.isDigit(c));
        System.out.println(Character.isLetter(c));
        System.out.println(Character.isLetterOrDigit(c));
        System.out.println(Character.isUpperCase(c));
        System.out.println(Character.isLowerCase(c));
    }


}
