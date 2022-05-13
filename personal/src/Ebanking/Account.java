package Ebanking;

public class Account {
    private double balance;
    private String accountNumber;
    private String customerName;
    private String email;
    private String phoneNumber;

    public Account(){
        this(200.0,"default name","123456", "default address","default number");
        System.out.println("default constructor");
    }

    public Account(double balance,String customerName,String accountNumber,String email, String phoneNumber){
        this.balance = balance;
        this.customerName = customerName;
        this.accountNumber = accountNumber;
        this.email =email;
        this.phoneNumber = phoneNumber;
    }
    public Account(String customerName,String phoneNumber,String email){
        this(500,customerName,"22222",email,phoneNumber);
    }

        public double getBalance() {
        return balance;
    }
    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double depositFunds(int amount) {
        balance = balance + amount;
        return balance;
    }

    public double withdrawFunds(int withdrawAmount) {
        if (balance - withdrawAmount  <= 0.0) {
            System.out.println("only deposited amount "+balance+ "is available. withdrawal was not processed");
        } else {
            balance = balance-withdrawAmount;
            System.out.println("the waithdrawn amount"+withdrawAmount+ "was successful");
        }
        return  balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getEmail() {
        return email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }
}