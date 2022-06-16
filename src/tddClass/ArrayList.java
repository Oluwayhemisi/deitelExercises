package tddClass;

import java.util.HashMap;

public class ArrayList {


    private String[] array;

    private int counter;

    public ArrayList() {
        array = new String[5];
    }

    public void add(String item) {
        if (counter < array.length) {
            array[counter] = item;
            counter++;
        } else if (counter == array.length) {
            expandLength();
            array[counter] = item;
            counter++;

        }
    }

    public int size(){

        return counter;
    }
    public String get(int index){
        return array[index];
    }

    public void remove(String item) {
        for (int i = 0; i < array.length; i++) {
            if(item.equals(array[i])){
                array[i] = null;
            }
        }
        for (int j = 0; j < counter; j++) {
            if(array[j] == null){
                array[j] = array[j + 1];
                array[j+1] = null;
            }
        }

        counter--;
    }
    public void remove (int index){
        for (int i = 0; i < array.length; i++) {
            if (index == i){
                array[i] = null;
            }
        }
        for (int i = 0; i < array.length-1; i++) {
            if (array[i] == null){
                array[i]= array[i + 1];
                array[i+1] = null;
            }
        }
        counter--;





    }
    public void implementAdd(int index, String item){
        String [] array2 = new String[array.length];
        for (int i = 0; i < array2.length; i++) {
            array2[i] = array[i];
        }
        array[index]= item;

        for (int i = 0; i < array.length-1; i++) {
            array[i+1] = array2[i];
        }
    }

    public void expandLength(){
        int newLength = array.length * 2;
        String [] array2 = new String[newLength];

        for(int i = 0; i < counter; i++) {
            array2[i] = array[i];

        }
        array = array2;
    }

    public void add(int index, String item){
        if(counter < array.length){
            implementAdd(index, item);
        }
        else if (counter == array.length){
            expandLength();
            implementAdd(index,item);
        }
        counter++;
    }
    public boolean contains(String item){
        for (int i = 0; i < array.length;i++){
            if (item.equals(array[i])){
                return true;
            }
        }
        return false;
    }
    public void set(int index, String newItem){
        for (int i = 0; i < array.length; i++) {
            if(index == i){
                array[i] = null;
            }
        }
        for (int i = 0; i < array.length; i++) {
            array[i] = newItem;
            counter++;

        }
    }

    public String[] getArray(){
        HashMap hashMap = new HashMap<>();
        return array;
    }
}
