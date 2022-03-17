package tddClass;

public class AccountOne {
    private String name;
    private double balance;

    public AccountOne(String name, double balance) {
        this.name = name;
        if (balance > 0.0) ;{this.balance = balance;}
    }
    public double getBalance(){return balance;}

    public void setName(String name){this.name = name;}

    public String getName(){return name;}

    public void depositAmount(double deposit){

    }

    public void deposit(double depositAmount) {
        balance = depositAmount + balance;
    }
}
