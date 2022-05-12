package chapterEight;

import java.util.Scanner;

public class GroceryMain {
    private static Scanner input = new Scanner(System.in);
    private static GroceryList groceryList = new GroceryList();

    public static void main(String[] args) {

        runApp();


    }
        public static void runApp(){
        boolean quit = false;
        printInstructions();
        while (!quit) {

            System.out.println("Enter your Choice: ");
            int choice = input.nextInt();
            input.nextLine();

            switch (choice) {

                case 0:
                    printInstructions();
                    break;

                case 1:
                    groceryList.printGroceryList();
                    break;
                case 2:
                    addItem();
                    break;
                case 3:
                    modifyItem();
                    break;
                case 4:
                    removeItem();
                    break;
                case 5:
                    searchItem();
                    break;
                case 6:
                    quit = true;
                    break;
                default:
                    System.out.println("Invalid input");
                    printInstructions();
                    break;

            }

            }
        }


    private static void printInstructions() {
        System.out.println("WELCOME TO YEMISI GROCERY STORE!");
        System.out.println("""
                press
                
                0-> to print choice option
                1-> print grocery-list
                2-> to add items
                3-> to modify item
                4-> to remove item
                5-> to find item
                6-> to quit
                """);
    }

    private static void addItem() {
        System.out.println("Enter the item you want to buy: ");
        String item = input.nextLine();
        groceryList.addItem(item);
    }

    private static void modifyItem() {
        System.out.println("Enter the item number: ");
        int itemNo = input.nextInt();
        input.nextLine();

        System.out.println("Enter the item you want to replace: ");
        String item = input.nextLine();

        groceryList.modifyGroceryItem(itemNo-1, item);
    }


    private static void removeItem() {
        System.out.println("Enter the item number you want to remove: ");
        int itemNo = input.nextInt();
        input.nextLine();
        groceryList.removeItem(itemNo);
    }


    private static void searchItem() {
        System.out.println("Enter the item: ");
        String item = input.nextLine();
        if (groceryList.findItem(item) != null) {
            System.out.println("found " + item + " in our Grocery store");
        } else {
            System.out.println(item + "Not found in our Grocery list");
        }
    }
}