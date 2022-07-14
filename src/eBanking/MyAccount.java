package eBanking;

public class MyAccount {
    private final String ACCOUNT_NUMBER;
    private final String fullName;
    private int balance;
    private final String pin;

    public MyAccount(String accountNumber,String firstName, String lastName,String pin){
        ACCOUNT_NUMBER = accountNumber;
        fullName = lastName+" "+firstName;
        this.pin =pin;



    }

    public String getAccountNumber() {
        return ACCOUNT_NUMBER;
    }

    public String getAccountName() {
        return fullName;
    }

    public void deposit(int amount) {
        balance += amount;
    }

    public int getBalance(String pin) {
        if(pin.equals(this.pin));
        return balance;
    }
    public String getFullName() {
        return fullName;
    }

    public void withdrawal(int amount,String pin) {
        if (this.pin.equals(pin)) {
            balance -= amount;
        }
    }
    @Override
    public String toString (){
        return String.format("""
                Account Name: %s
                Account Number: %s
                Balance: %d
                """,fullName,ACCOUNT_NUMBER,balance);
    }



}
