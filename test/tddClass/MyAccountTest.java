package tddClass;

import eBanking.MyAccount;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

class MyAccountTest {
    private MyAccount account;

    @BeforeEach
    void startWith() {
        account = new MyAccount("123456789","yemisi","Eshinlokun","1111");
    }

    @Test
    public void accountCanBeCreated(){
        assertNotNull(account);
    }

    @Test
    public void accountCanBeCreatedWithAllDetails(){
        assertEquals("123456789",account.getAccountNumber());
    }

    @Test
    public void accountCreateWithFullName(){
        assertEquals("Eshinlokun"+" "+"yemisi",account.getAccountName());
    }
    @Test
    public void depositTest(){
        account.deposit(500);
        assertEquals(500,account.getBalance("1111"));
    }
    @Test
    public void depositTwice(){
        account.deposit(600);
        account.deposit(500);
        assertEquals(1100,account.getBalance("1111"));
    }
    @Test
    public void withdrawalTest(){
        account.deposit(1500);
        account.withdrawal(600,"1111");
        assertEquals(900,account.getBalance("1111"));
    }
    @Test
    public void wrongPinTest(){
        account.deposit(1500);
        account.withdrawal(600,"1671");
        assertEquals(0,account.getBalance("1111"));
    }
    @Test
    public void accountBalanceReturnZeroWithWrongPin(){
        account.deposit(2000);
        assertEquals(0,account.getBalance("3454"));
    }
}