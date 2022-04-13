package chapterSeven;

import java.util.Scanner;

public class Homework {
    public static void main(String[] args) {
        int sum = 0;
        Scanner input = new Scanner(System.in);
//          int [] numbers = new int[10];
//        for (int i = 0; i < numbers.length; i++) {
//            numbers[i] = 9 - i;
//            System.out.println(numbers[i]);
//        }

      int [] list ={6,7,8,9,6,4,4,3,2,1};
        int min = list[0];
//
//        for (int i = 0; i < list.length; i++) {
//            System.out.println("enter a number");
//           // int num = input.nextInt();
//
//            list[i] = input.nextInt();
//
//        }
//        for (int i = 0; i < list.length; i++){
//            System.out.println(list[i]);


       // }

        for (int i = 1; i < list.length; i++) {
            //sum += list[i];
            if (list[i] < min){
                min = list[i];
            }

        }
        System.out.println();
        System.out.println(min);
    }


}
