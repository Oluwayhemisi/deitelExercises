package tddClass;

public class Stack {
    private int numberOfElements;
    private int [] array = new int[50];
    public boolean isEmpty() {
        if (numberOfElements == 0){
            return true;
        }
        return false;
    }

    public void push(int element) {
        array[numberOfElements] = element;
        numberOfElements++;
    }

    public int pop() {
        numberOfElements--;
        int remove = array[numberOfElements];
        array[numberOfElements] = 0;
        return remove;

    }

    public  int peek(){
      return   array[numberOfElements - 1];

    }
    public int[] array(){
        return array;
    }
}
