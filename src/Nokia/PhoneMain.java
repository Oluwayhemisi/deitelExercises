package Nokia;

import java.util.Scanner;

public class PhoneMain {
    private static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        runApp();
    }

    private static void runApp() {
        System.out.println("NOKIA \n WELCOME!!! ");
        mainMenu();
    }
    public static void mainMenu(){
        System.out.println("""
                1. -> Phonebook
                2. -> Messages
                3. -> Chat
                4. -> Call register
                5. -> Tones
                6. -> Settings
                7. -> Call divert
                8. -> Games
                9.-> Calculator
                10.-> Reminders
                11.-> Clock
                12.-> Profiles
                13.-> SIM services
                0.-> Exit
                """);
        String options = input.nextLine();
        switch (options){
            case "1" :
                NokiaPhone.phoneBook();
                break;
            case "2":
                NokiaPhone.messages();
                break;
            case "3":
                NokiaPhone.chat();
                break;
            case "4":
                NokiaPhone.callRegister();
                break;
            case "5":
                NokiaPhone.tones();
                break;
            case "6":
                NokiaPhone.settings();
                break;
            case "7":
                NokiaPhone.callDivert();
                break;
            case "8":
                NokiaPhone.games();
                break;
            case "9":NokiaPhone.calculator();
                break;
            case "10":
                NokiaPhone.reminders();
                break;
            case "11":
                NokiaPhone.clock();
                break;
            case "12":
                NokiaPhone.profiles();
                break;
            case "13":
                NokiaPhone.simServices();
                break;
            case "0":
                System.exit(0);
                break;
        }

    }

}
