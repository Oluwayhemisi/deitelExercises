package ChapterThree;

import java.util.Scanner;

public class AccountTest {
    public static void main(String[] args) {
        Account account1 =new Account("jane Green",50.0);
        Account account2 = new Account("John blue",-7.53);

        System.out.printf("account1 name is: %s%n%n",account1.getName(),account1.getBalance());
        System.out.printf("account2 name is: %s%n%n", account2.getName(),account2.getBalance());

        Scanner input = new Scanner(System.in);

        System.out.print("Enter deposit Amount for account1: ");
        double depositAmount = input.nextDouble();
        System.out.printf("%n adding %.2f to account1balance%n%n",depositAmount);
        account1.deposit(depositAmount);

        System.out.printf("%s balance: %.2f%n", account1.getName(),account1.getBalance());
        System.out.printf("%s balance: %.2f%n", account2.getName(),account2.getBalance());

        System.out.print("Enter deposit Amount for account2: ");
        depositAmount = input.nextDouble();
        account2.deposit(depositAmount);

        System.out.printf("%s balance: %.2f%n", account1.getName(),account1.getBalance());
        System.out.printf("%s balance: %.2f%n", account2.getName(),account2.getBalance());
    }
}
