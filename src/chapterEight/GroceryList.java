package chapterEight;

import java.util.ArrayList;

public class GroceryList {
    private ArrayList<String> groceryList = new ArrayList<>();


    public void addItem( String item){
        groceryList.add(item);
    }
    public void printGroceryList(){
        System.out.println("You have "+groceryList.size()+ " in your grocery list.");
        for (int i = 0; i < groceryList.size(); i++) {
            System.out.println(i+1 +"."+ groceryList.get(i));

        }
    }
    public void modifyGroceryItem(int  position, String item){
        groceryList.set(position,item);
        System.out.println("Grocery item "+(position+1)+ "has been modified");

    }
    public void removeItem(int position){
        String item = groceryList.get(position);
        groceryList.remove(position);
    }
    public String findItem(String searchItem){
        int position = groceryList.indexOf(searchItem);
        if(position >=0 ){
            return groceryList.get(position);
        }
        return null;
    }
}
