package personalWork;

public class SwapArray {
    public static void main(String[] args) {
        int [] array = {1,2};
        System.out.println("Before invoking");
        System.out.println("array is{ " + array[0]+ ","+array[1]  + "}");

        swap(array[0],array[1]);
        System.out.println("After invoking");
        System.out.println("array is{ " + array[0]+ ","+array[1]  + "}");

        System.out.println("Before invoking swapFirstTwoInArray");
        System.out.println("array is{ " + array[0]+ ","+array[1]  + "}");

        swapTwoInArray(array);
        System.out.println("After invoking swapFirstTwoInArray");
        System.out.println("array is{ " + array[0]+ ","+array[1]  + "}");

    }
    public static void swap(int n1, int n2){
        int temp = n1;
        n1 = n2;
        n2 = temp;

    }
    public static void swapTwoInArray(int[] array){
        int temp = array[0];
        array[0] = array[1];
        array[1] = temp;

    }
}
