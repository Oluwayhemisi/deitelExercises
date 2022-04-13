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
        return null;
    }
}
