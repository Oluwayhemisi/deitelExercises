package Ebanking;

public class BankAccount {
    public static void main(String[] args) {
        Account yemisi = new Account();
        yemisi.depositFunds(3000);
        System.out.println("The amount deposited is: "+yemisi.getBalance());

        yemisi.withdrawFunds(2000);
        System.out.println("the balance is : "+yemisi.getBalance());
        Account florenceAccount = new Account("Florence","2222","flo@mail.com");
        florenceAccount.withdrawFunds(1000);

    }

    }

