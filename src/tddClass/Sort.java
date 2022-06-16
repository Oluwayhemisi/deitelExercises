package tddClass;

public class Sort {

    public int[] sortArray(int[] array) {
        for (int lastUnsortedIndex = array.length-1; lastUnsortedIndex > 0 ; lastUnsortedIndex--) {
            for (int i = 0; i < lastUnsortedIndex; i++) {
                if(array[i] > array[i + 1]){
                  implementSort(array, i,i+1);
                }
            }
        }
        return array;

    }
    private void implementSort(int[] swapArray, int i, int j){
        if(i == j){
            return ;
        }
        else{
            int temp = swapArray[i];
            swapArray[i] = swapArray[j];
            swapArray[j] = temp;
        }
    }

    public int[] selectSortArray(int[] array){

        for (int lastUnsortedIndex = array.length-1; lastUnsortedIndex > 0 ; lastUnsortedIndex--) {
            int largest = 0;
            for (int i = 1; i <= lastUnsortedIndex; i++) {
                if(array[i] > array[largest]){
                    largest = i;
                }
                implementSort(array, largest, lastUnsortedIndex);
            }
        }
        return array;
    }
}
