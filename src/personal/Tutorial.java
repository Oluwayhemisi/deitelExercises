package personal;

import java.util.Scanner;

public class Tutorial {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        for (int i = 1; i < 5; i++) {
            for (int j = 1; j < i; j++) {
                System.out.print("* ");

            }
            System.out.println();

        }
        System.out.println();

//        for (int i = 0; i < 3; i++) {
//            System.out.print("* ");
//        }
//        for (int i = 0; i < 3; i++) {
//            System.out.print("1");
//        }
        for (int i =0; i < 5; i++) {
            for (int j = 5; j >i ; j--) {
                System.out.print("  ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }


    }
}
