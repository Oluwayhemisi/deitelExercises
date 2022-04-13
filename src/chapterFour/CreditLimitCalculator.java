package chapterFour;

import java.util.Scanner;

public class CreditLimitCalculator {
    public static void main(String[] args) {
        int accountNumber = 0;
        int beginningBalance = 0;
        int charges = 0;
        int credits = 0;
        int creditLimit = 800;
        int balance = 0;
        Scanner input = new Scanner(System.in);

        System.out.println("Enter account number");
        accountNumber = input.nextInt();

        System.out.println("Enter balance at the beginning of the month");
        beginningBalance = input.nextInt();

        System.out.println("Total of all items charged by the customer's this month");
        charges = input.nextInt();

        System.out.println("Enter total of all credits applied to the customer's account");
        credits = input.nextInt();

        System.out.println("Enter the credit limit");
        creditLimit = input.nextInt();


        balance = beginningBalance + charges - credits;
        System.out.println("the balance is: " + balance);


        if (balance < creditLimit) {
            System.out.println("you still have credits");
        } else {
            System.out.println("credit limit exceeded");
        }
    }
}