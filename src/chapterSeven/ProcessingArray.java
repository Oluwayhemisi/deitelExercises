package chapterSeven;

import java.util.Scanner;

public class ProcessingArray {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double[]  myList = new double[10];

//        initializing Arrays with input values

        System.out.println("Enter"+ myList.length+"values");
        for (int i = 0; i < myList.length; i++) {
            myList[i] = input.nextDouble();
//            System.out.println(Arrays.toString(myList));

        }


//initializing arrays with random values
//        for (int i = 0; i < myList.length; i++) {
//            myList[i] = Math.random() * 100;
//
//            System.out.printf("%.2f%n",myList[i]);
//
//        }

//        displaying arrays
        for (int i = 0; i < myList.length; i++) {
            System.out.print(myList[i]+ " ");

        }
//
        double max = myList[0];
        for (int i = 0; i < myList.length; i++) {
            if(myList[i] > max){
                max = myList[i];
            }

        }
        System.out.println();
        System.out.println("the maximum is: "+ max);

         max = myList[0];
         int indexOfMax = 0;
        for (int i = 0; i < myList.length; i++) {
            if (myList[i] > max){
                max = myList[i];
                indexOfMax = i;
            }

        }
        System.out.println("the index of max is: "+indexOfMax);



    }
}
