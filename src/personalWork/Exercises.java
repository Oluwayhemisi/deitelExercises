package personalWork;

import java.util.Scanner;

public class Exercises {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
//        int x = 30;
//        int [] number = new int[x];
//        x = 60;
//        System.out.println("x is: "+ x);
//        System.out.println("The size of numbers is "+number.length);
//
//
//        double [] r = new double[100];
//        for (int i = 0; i < r.length; i++) {
//            r[i] = Math.random() * 100;
//
//
//        }
//        System.out.println("the array is :"+ Arrays.toString(r));


        int [] list  = {1,2,3,4,5,6};
        for(int i = 1; i < list.length ; i++) {
            list[i] = list[i - 1];
        }

        for(int i = 0; i < list.length ; i++) {
            System.out.println(list[i]+" ");
        }


    }
}
