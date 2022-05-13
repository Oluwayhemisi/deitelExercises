import ChapterEight.Entries;
import tdd.Diary;

import java.util.Objects;
import java.util.Scanner;

public class DiaryMain {

    private static Diary diary = new Diary("1234");


    public static void main(String[] args) {
        runApp();

    }


    private static boolean locked;
    private static Scanner scanner =  new Scanner(System.in);
    private static boolean isLocked;


    public static void runApp() {
        for (int i = 0; i != -1; i++) {
            System.out.println("""
                    1. --> press 1 to create entry
                    2. --> press 2 to find entry
                    3. --> press 3 to delete entry
                    4.--> press 4 to exit
                    
                    
                    """);

            int response = scanner.nextInt();
            scanner.nextLine();
            switch (response){
                case 1:
                    createEntry();
                    break;
                case 2:
                    findEntry();
                    break;
                case 3:
                    deleteEntry();
                    break;
                case 4:
                    exit();
                default:
                    System.out.println("Invalid input!");
                    runApp();
                    break;
            }
        }
    }

    public static  void lockAndUnlock(){

        System.out.println("Enter password: ");
        String password = scanner.nextLine();

        if (Objects.equals(password, diary.getPassword())){
            diary.isLock(password);
            runApp();
        }
        else
            System.out.println("Invalid password");

    }

    public static void createEntry(){
        System.out.println("Enter title: ");
        String title = scanner.nextLine();

        System.out.println("create body");
        String body = scanner.nextLine();

        System.out.println("Enter password");
        String password = scanner.nextLine();

        Entries entry = diary.createEntries(title,body,password);
        diary.addEntry(entry);

        System.out.println("Entry successfully added!");

    }
    public static void findEntry(){
        System.out.println("Enter entry number: ");
        int entryNumber = scanner.nextInt();

        System.out.println(diary.findEntry(entryNumber));
    }

    public static void deleteEntry(){
        System.out.println("Enter entry number: ");
        int entryNumber = scanner.nextInt();

        if (diary.deleteEntry(entryNumber)){
            System.out.println("Entry successfully deleted!");
        }
        else System.out.println("Entry not found");
    }
    public static void exit(){
        System.out.println("Thank you!");
        System.exit(0);
    }
}
