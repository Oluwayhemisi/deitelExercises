package chapterEight;

import tddClass.Diary;

import java.util.Objects;
import java.util.Scanner;

public class DairyMain {
    private static Scanner input = new Scanner(System.in);
    private static Diary diary;


    public static void main(String[] args) {
        signUp();

    }

    public static void signUp() {
        System.out.println("Enter username");
        String userName = input.nextLine();


        System.out.println("create password");
        String password = input.nextLine();
        diary = new Diary(password, userName);

        System.out.println("Registration completed");
        logIn();
    }

    public static void logIn() {
        System.out.println("Enter username");
        String userName = input.nextLine();


        System.out.println("Enter password");
        String password = input.nextLine();

        if (diary.validatePassword(password) && Objects.equals(diary.getUserName(), userName)) {
            System.out.println("WELCOME "+userName);
            runApp();
        } else
            System.out.println("Invalid password");
        logIn();


    }
    public static void runApp(){
        boolean quit = false;
        Instructions();
        while(!quit){
            System.out.println("Enter Number: ");
            int number = input.nextInt();
            input.nextLine();

            switch (number){
                case 1:
                    createNumberOfEntries();
                    break;
                case 2:
                    viewEntry();
                    break;
                case 3:
                    findEntry();
                    break;
                case 4:
                    deleteEntry();
                    break;
                case 5:
                    changePassword();
                    break;
                case 6:
                    quit = true;
                    break;
                default:
                    runApp();
                    break;


            }
        }
    }


    private static void Instructions() {

        System.out.println("""
                press
                1-> To create Entries
                2-> To view Entry
                3-> To find Entry
                4-> To delete Entry
                5-> To change password
                6-> To quit
                """);
    }
    private static void createNumberOfEntries() {
        System.out.println("Enter title: ");
        String title = input.nextLine();

        System.out.println("Good to have you here!\nWhat will you like to share? ");
        String body = input.nextLine();

        Entry entry = diary.createEntry(title,body);
        diary.addEntry(entry);

        System.out.println("Entry successfully added with id "+diary.getNumberOfEntries()+ "!!!");
        runApp();

    }
    private static void viewEntry(){

        System.out.println("Enter number: ");
        int indexNumber = input.nextInt();

        input.nextLine();

        System.out.println("Enter the title: ");
        String title = input.nextLine();

        System.out.println("feel free to express yourself: ");
        String body = input.nextLine();


        Entry entry = new Entry(title,body);
        diary.editEntry(indexNumber,entry);
        runApp();
    }

    public static void findEntry(){
        System.out.println("Enter entry number: ");
        int entryNumber = input.nextInt();

        System.out.println(diary.findEntry(entryNumber));
        runApp();

    }
    public static void deleteEntry() {
        System.out.println("Enter entry number: ");
        int entryNumber = input.nextInt();
        if (diary.deleteEntry(entryNumber)) {
            System.out.println("Entry successfully deleted!");
        } else {
            System.out.println("Entry not found");
        }
    }
    public static void changePassword(){
        System.out.println("Enter old password: ");
        String oldPassword = input.nextLine();

        System.out.println("Enter new password: ");
        String newPassword = input.nextLine();
        diary.changePassword(oldPassword,newPassword);
        System.out.println("password has been successfully been changed ");
        runApp();

    }


}
