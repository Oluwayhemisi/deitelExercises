import tddClass.AccountOne;
import java.util.Scanner;



public class AccountOneTest {
    public static void main(String[] args) {
        AccountOne account1 = new AccountOne("Jane Green", 50.00);
        AccountOne account2 = new AccountOne("John Blue", -7.53);

        System.out.printf("%s balance: $ %.2f %n", account1.getName(), account1.getBalance());
        System.out.printf("%s balance: $ %.2f %n",account2.getName(),account2.getBalance() );

        Scanner input = new Scanner(System.in);

        System.out.println("Enter deposit amount for account1: ");
        double depositAmount = input.nextDouble();
        System.out.printf("%nadding %.2f to account1 balance %n%n", depositAmount);
       account1.deposit(depositAmount);

        System.out.printf("%s balance: $ %.2f %n", account1.getName(), account1.getBalance());
        System.out.printf("%s balance: $ %.2f %n%n",  account2.getName(), account2.getBalance());

        System.out.println("Enter deposit amount for account2: ");
        depositAmount = input.nextDouble();
        System.out.printf("%s balance $ %.2f %n", account2.getName(),depositAmount);
        account2.deposit(depositAmount);

        System.out.printf("%s balance: $ %.2f %n", account1.getName(), account1.getBalance());
        System.out.printf("%s balance: $ %.2f 25%n", account2.getName(), account2.getBalance());

    }
}
