import java.util.Arrays;

public class CuttingStick {

    public static int[] getTheSmallestNumber(int[] array) {
        int smallest = array[0];
        int[] arrlength = new int[10];
        int counter = 0;
        int get = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < smallest) {
                smallest = array[i];
            }
            for (int j = i; j < array.length; j++) {
                get = array[j + 1] - smallest;
                if (get != 0) {
                    counter++;
                }
                arrlength[counter] = get;
            }


            System.out.println(Arrays.toString(arrlength));

            return arrlength;
        }

    }
    }



    public static void main(String[] args) {
        int []
        getTheSmallestNumber()
    }

}
