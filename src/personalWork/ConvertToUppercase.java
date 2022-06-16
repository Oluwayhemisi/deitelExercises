package personalWork;

import java.util.Scanner;

public class ConvertToUppercase {
    public static void main(String[] args) {
        Scanner keyboardInput = new Scanner(System.in);
        display("my name is yemisi");


    }
    public static void display(String prompt){
        System.out.println(prompt.toUpperCase());
    }









public void showInputInUpperCase(){

//        Fetch Keyboard Input
        Scanner scanner = new Scanner(System.in);
        String inputText = scanner.nextLine();

//        convert
    String upperCaseText = inputText.toUpperCase();

//    display
    System.out.println(upperCaseText);

}


}
