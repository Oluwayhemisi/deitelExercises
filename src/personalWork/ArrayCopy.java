package personalWork;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayCopy {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int [] source = {3,4,5};
        int [] get  = new int[source.length];

        for (int i = 0; i < source.length; i++) {
            get[i] = source[i];

        }
        System.out.println(" the array copied is:"+ Arrays.toString(get));

        int[] myList;
        myList = new int[3];
        myList = new int[5];
        int sum = 0;
        System.out.println("Enter a number");
        for (int i = 0; i < myList.length; i++) {
             myList[i] =  input.nextInt();
            sum += myList[i];
        }
        System.out.println("the sum is: "+sum);
    }
}
