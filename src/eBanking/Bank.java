package eBanking;

public class Bank {
    private final String name;
    private final MyAccount[] accounts;
    private int numberOfCustomer;


    public Bank(String bankName,int numberOfCustomer){
        name = bankName;
        accounts = new MyAccount[numberOfCustomer];
    }

    public String getName() {
        return name;
    }

    public int getMaximumNumberOfCustomers() {
        return accounts.length;
    }

    public MyAccount createAccountFor(String firstName, String lastName, String pin) {
        String accountNumber = (numberOfCustomer +1) +"";
        MyAccount account = new MyAccount(accountNumber,firstName,lastName,pin);
        accounts[numberOfCustomer] = account;
        numberOfCustomer++;
        return account;
    }

    public int getNumberOfCustomers() {
        return numberOfCustomer;
    }

    public MyAccount findAccount(int accountNumber) {
        return accounts[accountNumber - 1];
    }

    public void deposit(int amount, String accountNumber) {
        MyAccount  account = findAccount(Integer.parseInt(accountNumber));
        account.deposit(amount);
    }

    public void withdraw(int amount, String accountNumber, String pin) {
        MyAccount account = findAccount(Integer.parseInt(accountNumber));
        account.withdrawal(amount,pin);
    }
    public void transfer(int amount,String from, String to, String sendersPin){
        MyAccount sendersAccount = findAccount(Integer.parseInt(from));
        MyAccount receiversAccount = findAccount(Integer.parseInt(to));
        sendersAccount.withdrawal(amount,sendersPin);
        receiversAccount.deposit(amount);
    }
}
