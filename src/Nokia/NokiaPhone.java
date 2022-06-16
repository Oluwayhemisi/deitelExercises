package Nokia;

import java.util.Scanner;

public class NokiaPhone{
    private static String number;
    private static Scanner input = new Scanner(System.in);


    public static void phoneBook() {
        print("""
                1. -> Search
                2. -> Service Nos
                3. -> Add name
                4. -> Erase
                5. -> Edit
                6. -> Assign tone
                7. -> Send B'card
                8. -> Options
                9. -> Speed Dials
                10. -> voice Tags
                0. -> back
                """);
         number = input.nextLine();
        switch (number){
            case "1":
                print("search");
                break;
            case "2":
                print("serviceNos");
                break;
            case "3":
                print("addName");
                break;
            case "4":
                print("erase");
                break;
            case "5":
                print("edit");
                break;
            case "6":
                print("assignTone");
                break;
            case "7":
                print("sendBcard");
                break;
            case "8":
                print("options");
                print("""
                        1. -> type of view
                        2. -> memory Status
                        """);
                 number = input.nextLine();
                break;
            case "9":
                print("speedDials");
                break;
            case "10":
                print("voiceTags");
                break;
            case "0":
                PhoneMain.mainMenu();
                break;
            default:
                phoneBook();
                break;
        }

    }

    public static void messages() {
        print("""
                1. -> Write Messages
                2. -> Inbox
                3. -> Outbox
                4. -> PictureMessages
                5. -> Templates
                6. -> Smileys
                7. -> Message Settings
                8. -> Info service 
                9. -> voice mailbox number
                10.-> Service command editor
                0. -> Back
                
                """);

        number = input.nextLine();
        switch (number){
            case "1" :
                print("write message");
                break;
            case "2":
                print("inbox");
                break;
            case "3":
                print("outbox");
                break;
            case "4":
                print("picture messages");
                break;
            case "5":
                print("Templates");
                break;
            case "6":
                print("smiley");
                break;
            case "7":
                print("Message settings");
                print("""
                        1. -> Set1
                        2. -> Common
                        """);
                number = input.nextLine();
                switch (number){
                    case "1":
                        print("""
                                1-> message center number
                                2-> message sent as
                                3-> message validity
                                """);
                        break;
                    case "2":
                        print("""
                                1-> Delivery report
                                2-> reply via same centre
                                3-> character support
                                """);
                        break;

                }
                messages();
                break;
            case "8":
                print("Info service");
                break;
            case "9":
                print("Voice mailbox number");
                break;
            case "10":
                print("service command editor");
                break;
            case "0":
                PhoneMain.mainMenu();
                break;
            default:
                messages();
                break;
        }


    }

    public static void callRegister() {
        print("""
                1.-> Missed calls
                2.-> Received calls
                3.-> Dialled numbers
                4.-> Erase recent call lists 
                5.-> Show call duration
                6.-> show call costs
                7.-> call cost settings
                8.-> prepaid credit
                0.-> back
                """);

        number = input.nextLine();
        switch (number){
            case "1":
                print("Missed calls");
                break;
            case "2":
                print("received calls");
                break;
            case "3":
                print("Dialled numbers");
                break;
            case "4":
                print("Erase recent call lists");
                break;
            case "5":
                print("show call duration");
                print("""
                        1. -> last call duration
                        2. -> All call's duration
                        3. -> Received calls duration
                        4. -> Dialled calls duration
                        5. -> Clear timers
                        """);
                callRegister();
                break;
            case "6":print("show call cost");
                print("""
                        1. -> last call cost
                        2. -> All calls cost
                        3. -> clear counter
                        """);
                callRegister();
                break;
            case "7":
                print("call cost settings");
                print("""
                        1. -> call cost limit
                        2. -> show cost in
                        """);
                callRegister();
                break;
            case "8":
                break;
            case "0":
                PhoneMain.mainMenu();
                break;
            default:
                callRegister();
                break;

        }


    }


    public static void tones() {
        print("""
                1.-> Ringing tone
                2.-> Ringing volume
                3.-> Incoming call Alert
                4.-> Composer
                5.-> Message Alert Tone
                6.-> Keypad Tones
                7.-> Warning and game tones
                8.-> vibrating alert
                9.-> Screen saver
                0.-> back
                """);
        number = input.nextLine();
        switch (number){
            case "1":
                print("Ringing Tones");
                break;
            case "2":
                print("Ringing volume");
                break;
            case "3":
                print("Incoming call alert");
                break;
            case  "4":
                print("Composer");
                break;
            case "5":
                print("Message alert Tone");
                break;
            case "6":
                print("Keypad Tones");
                break;
            case "7":
                print("Warning and Game Tones");
                break;
            case "8":
                print("Vibrating alert");
                break;
            case "9":
                print("Screen saver");
                break;
            case "0":
                PhoneMain.mainMenu();
                break;
            default:
                tones();
                break;



        }

    }

    public static void settings() {
        print("""
                1.-> Call settings
                2.-> Phone settings
                3.-> Security settings
                4.-> Restore factory settings
                """);
        number = input.nextLine();
        switch (number){
            case "1":
                print("Call settings");
                print("""
                        1.-> Automatic redial
                        2.-> Speed dialing
                        3.-> Call waiting options
                        4.-> Own number setting
                        5.-> Phone line in use
                        6.-> Automatic answer
                        0.-> Back
                        """);
                settings();
                break;
            case "2":
                print("Phone settings");
                print("""
                        1.-> Automatic redial
                        2.-> Language
                        3.-> Cell info display
                        4.-> Welcome note
                        5.-> Network selection
                        6.-> lights
                        0.-> Back
                        """);
                settings();
                break;
            case "3":
                print("Security settings");
                print("""
                        1.-> Automatic redial
                        2.-> Speed dialing
                        3.-> Call waiting options
                        4.-> Own number setting
                        5.-> Phone line in use
                        6.-> Automatic answer
                        0.-> Back
                        """);
                break;
            case "4":
                break;

        }

    }

    public static void games() {

    }


    public static void calculator() {

    }

    public static void clock() {

    }

    public static void chat(){
        System.out.println("chat has been called");
        PhoneMain.mainMenu();
    }
    public static void callDivert(){
        System.out.println("call divert has been called");
        PhoneMain.mainMenu();
    }

    public static void reminders(){
        System.out.println("Reminders has been called");
        PhoneMain.mainMenu();
    }
    public static void profiles(){
        System.out.println("profile has been called");
        PhoneMain.mainMenu();
    }
    public static void simServices(){
        System.out.println("simServices has been called");
        PhoneMain.mainMenu();
    }

    public static void print(String s){
        System.out.println(s);
    }

    public static void print(int s){
        System.out.println(s);
    }

    public static String input(){
        Scanner input = new Scanner(System.in);
        return input.nextLine();
    }
}
