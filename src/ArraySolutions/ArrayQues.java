package ArraySolutions;

public class ArrayQues {
    public int [] newArray;



    public int[] moveZero(int [] array){
         newArray = new int[13];
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] != 0) {

                array[count] = array[i];
                count++;
            }
        }

            return newArray;

    }
    public int[] getArray(){
        return newArray;
    }
  public void sortArray(int[] array){
        for(int unsorted = array.length-1; unsorted > 0; unsorted--){
            int temp = 0;
            for (int i = 0; i < unsorted; i++) {
                if(array[i] != 0)
                    if (array[i] > array[i + 1]) {
                        temp = array[i];
                        array[i] = array[i + 1];
                    array[i + 1] = temp;
                }

            }
        }

  }


}
