package personalWork;

public class PassingarrayToMethod {
   private static int [] array = new int[5];
    public static void main(String[] args) {
        printArray(new int[]{3,4,5,6,7});
    }
    public static void printArray(int[] array){
        for (int i = 0; i < array.length ; i++) {
            System.out.println(array[i]+"  ");
        }
    }
}
