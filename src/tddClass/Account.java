package tddClass;

public class Account{
    private int balance;
    public void deposit(int amount) {
        if (amount > 0) {
            balance = amount + balance;
        }
    }

    public int getBalance() {
        return balance;
    }
    public void withdraw(int amount){
        int withdraw = 0;
        if (balance < withdraw) {
            balance = balance - amount;
        }
    }

}
