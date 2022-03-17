package chapterTwo;

import java.util.Scanner;

public class OneAndZero{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println( " Enter a number ");
        int number1 = input.nextInt();
          if (number1 == 0){
              System.out.println(1);
          }
        if (number1 == 1) {
            System.out.println(0);
        }

    }
}
