package dsa;

public class Stack {
    private int numberOfElement;
    private int[] elements = new int[10];


    public boolean isEmpty() {
        if (numberOfElement == 0)
        return true;
        else return false;
    }
    public void push(int element){
        elements[numberOfElement] = element;
        numberOfElement++;
    }

    public int pop() {
        numberOfElement--;
        return elements[numberOfElement];
    }

    public int peek() {
        return elements[numberOfElement - 1];
    }
}
