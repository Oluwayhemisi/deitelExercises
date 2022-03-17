package chapterThree;


import java.util.Scanner;

public class AccountingTest {
    public static void main(String[] args) {

        Accounting myAccounting1 = new Accounting("Jane green", 50.00);
        Accounting myAccounting2 = new Accounting("John Blue", -7.53);

        System.out.printf("%s balance is: %.2f%n", myAccounting1.getName(), myAccounting1.getBalance());
        System.out.printf("%s balance is: %.2f%n", myAccounting1.getName(), myAccounting2.getBalance());

        System.out.print("\nEnter deposit amount for account1:   ");
        Scanner input = new Scanner(System.in);
        
        double depositAmount = input.nextDouble();

        System.out.printf("%n adding %.2f to account1  balance%n%n", depositAmount);
        myAccounting1.deposit(depositAmount);

        System.out.printf(" %s balance is: %.2f%n", myAccounting1.getName(), myAccounting1.getBalance());
        System.out.printf("%s balance is: %.2f%n", myAccounting2.getName(), myAccounting2.getBalance());

        System.out.println("Enter deposit amount for account2");
        double depositAmount2 = input.nextDouble();

        System.out.printf("%n adding %.2f%n to account2 balance%n%n", depositAmount2);
        myAccounting2.deposit(depositAmount);

        System.out.printf(" %s balance is: %.2f%n", myAccounting1.getName(), myAccounting1.getBalance());
        System.out.printf("%s balance is: %.2f%n", myAccounting2.getName(), myAccounting2.getBalance());

    }
}
































        /*Accounting myAccounting1 = new Accounting( "Jane Green");
        Accounting myAccounting2 = new Accounting("John blue");

        System.out.printf("Account1 name is: %s%n",myAccounting1.getName());
        System.out.printf("Account2 name is: %s%n", myAccounting2.getName());*/





       /* System.out.printf("the initial name is %s%n%n ", myAccounting.getName());

        System.out.println("please enter the name:" );
        String theName = input.nextLine();

        myAccounting.setName(theName);
        System.out.println();

        System.out.printf("the name in object myAccounting is: %n%s%n", myAccounting.getName());*/


