package chapterEight;

import tddClass.Diary;

import java.util.Scanner;

public class DairyMain {
    private static Scanner input = new Scanner(System.in);
    private static Diary diary;
    public static void main(String[] args) {
        runApp();

    }
    public static void runApp(){
        System.out.println("Enter username: ");
        String userName = input.nextLine();

        System.out.println("Create password");
        String password = input.nextLine();

        diary = new Diary(password,userName);

        System.out.println("WElCOME "+userName);
        boolean quit = false;
        Instructions();
        while(!quit){
            System.out.println("Enter Number: ");
            int number = input.nextInt();
            input.nextLine();

            switch (number){
                case 0:
                    unLockDiary();
                    break;
                case 1:
                    Instructions();
                    break;
                case 2:
                    createNumberOfEntries();
                    break;
                case 3:
                    viewEntry();
                    break;
                case 4:
                    findEntry();
                    break;
                case 5:
                    deleteEntry();
                    break;
                case 6:
                    changePassword();
                    break;
                case 7:
                    changeUserName();
                    break;
                case 8:
                    quit = true;
                    break;
                default:
                    runApp();
                    break;


            }
        }
    }
    public static void unLockDiary(){
        System.out.println("Enter password: ");
        String password = input.nextLine();

        if (diary.validatePassword(password)){
            diary.unLockDiary(password);
            runApp();
        }
        else
            System.out.println("Invalid password");

    }
        int entryNumber = input.nextInt();



    private static void Instructions() {

        System.out.println("""
                press
                0-> To unlock
                1-> To Instructions
                2-> To create Entries
                3-> To view Entry
                4-> To find Entry
                5-> To delete Entry
                6-> To change password
                7-> To changeUsername
                8-> To quit
                """);
    }
    private static void createNumberOfEntries() {
        System.out.println("Enter password: ");
        String password = input.nextLine();

        System.out.println("Enter title: ");
        String title = input.nextLine();

        System.out.println("Good to have you here!\nWhat will you like to share? ");
        String body = input.nextLine();

        Entry entry = diary.createEntry(title,body);
        diary.addEntry(entry);

        System.out.println("Entry succesfully added! ");

    }
    private static void viewEntry(){

        System.out.println("Enter title: ");
        String title = input.nextLine();

        System.out.println("Good to have you here! \n What dou you want to share? ");
        String body = input.nextLine();

        Entry entry = new Entry(title,body);
        diary.addEntry(entry);
    }

    public static void findEntry(){
        System.out.println("Enter entry number: ");
        int entryNumber = input.nextInt();

        System.out.println(diary.findEntry(entryNumber));

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

    }
    private static void changeUserName() {
        System.out.println("Enter old username");
        String oldUsername = input.nextLine();

        System.out.println("Enter new username");
        String newUsername = input.nextLine();
        diary.changeUserName(oldUsername,newUsername);
    }

}
