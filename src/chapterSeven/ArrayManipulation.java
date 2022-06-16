package chapterSeven;

import java.util.Arrays;

public class ArrayManipulation {
    public static void main(String[] args) {
        double [] doubleArray = {8.3,9.4,0.2,7.9,3.4};
        Arrays.sort(doubleArray);
        System.out.printf("%ndoubleArray: ");
        for(double value : doubleArray){
            System.out.printf("%.1f",value);
        }

//        int[] filledIntArray = new int[10];
//        Arrays.fill(filledIntArray,7);
//        displayArray(filledIntArray,"filledIntArray");
//
//        int[] intArray = {1,2,3,4,5,6};
//        int[] intArrayCopy = new int[intArray.length];
//        System.arraycopy(intArray,0,intArrayCopy,0,intArray.length);
//        displayArray(intArray,"intArray");
//        displayArray(intArrayCopy,"intArrayCopy");
//
//        boolean b = Arrays.equals(intArray,intArrayCopy);
//        System.out.printf("%n%nintArray %s filledIntArray");
//        System.out.printf("%n%nintArray %s filledIntArray%n",(b ? "==" : "!="));
//
//        b = Arrays.equals(intArray,filledIntArray);
//        System.out.printf("intArray %s filledIntArray %n",(b ? "==" :"!="));
    }

}
