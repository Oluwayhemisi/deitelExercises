package chapterFour;

import java.util.Scanner;

public class LicensingExam {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int passes = 0;
        int failed = 0;
        int counter = 1;


        while ( counter <= 10){

            System.out.println("Enter result (1 = passed, 2 = failed):  ");
            int result = input.nextInt();

            if (result == 1){
                passes = passes + 1;
            }
            else {
               failed = failed + 1;
            }
            counter = counter + 1;

        }
        System.out.println("passed:" +passes+ "failed:"+ failed);

        if (passes > 8){
            System.out.println("bonus to the instructor");
        }
        else {
            System.out.println("you need to work hard");
        }
    }
}
