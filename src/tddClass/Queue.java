package tddClass;

public class Queue {
    private int numberOfElements;
    private int[] array;
    private int counter;

    public Queue() {
        array = new int[10];
    }

    public int enQueue(int element) {
        array[numberOfElements] = element;
        return numberOfElements++;
    }

    public boolean isEmpty() {
        if (numberOfElements == 0)
            return true;
        return false;
    }

    public int deQueue() {
        numberOfElements--;
        int remove = array[0];
        for (int i = 0; i < array.length-1; i++) {
                array[i] = array[i + 1];
            }
        return remove;


    }

    public int peek() {
        numberOfElements--;
        return array[0];

        }

    public int[] array(){
        return array;
        }

//    public boolean contains(int element){
//        if
//    }

    }
