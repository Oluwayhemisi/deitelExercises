package ArraySolutions;

public class PeakElement {

    public static int peak(int[] array){
        for (int i = 0; i < array.length-1; i++) {
            int container = i;
            if(array[i] > array[i+1] && array[i] > array[i-1]){
                int get = container;
//
                System.out.println(get);
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        int[] arr ={2,4,5,8,3,6,1};
        peak(arr);
    }
}
