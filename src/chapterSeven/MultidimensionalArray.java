package chapterSeven;

public class MultidimensionalArray {
    public static void main(String[] args) {
        int [][] array1 = {{1,2,3},{4,5,6}};
        int [][] array2 = {{1,2},{3},{4,5,6}};

        System.out.println("the values of the array1 are: %s%n");
        outputArray(array1);

        System.out.println("the values of the array2 are: %s%n");
        outputArray(array2);


        }
    public static void outputArray(int [][]array){
        for (int row = 0; row < array.length; row++) {
            for (int column = 0; column < array[row].length; column++) {
                System.out.printf("%d  ",array[row][column]);

            }
            System.out.println();
        }
    }
}
