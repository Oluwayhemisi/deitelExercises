package chapterSeven;

import java.util.Scanner;

public class TwoDimensionPractice {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("ENTER WIFE POSITION");
        int funmi = input.nextInt();

        System.out.println("ENTER WIFE POSITION");
        int yemisi = input.nextInt();
        int [][] wale = new int[funmi][yemisi];

        for (int i = 0; i < funmi; i++) {
            for (int j = 0; j < yemisi; j++) {
                System.out.println("Enter value of each element");
//                int wives = wale[i][j];
                wale[i][j] = input.nextInt();
//                System.out.println("The value of wives is "+wale[i][j]);

            }

        }

        for (int i = 0; i < funmi; i++) {
            for (int j = 0; j < yemisi; j++) {
                System.out.println("the value of funmi"+i+ " in yemisi"+j+ " is " +wale[i][j]);
            }
        }
        }


        }

