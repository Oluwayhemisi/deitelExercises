package tddClass;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AccountTest {


    @Test
     public void depositTest(){
        //given
        Account funmiAccount = new Account();
        //when
        funmiAccount.deposit(100);
        //assert
        assertEquals(100, funmiAccount.getBalance());
    }



    @Test
    public void depositTwiceTest(){
        //given
        Account funmiAccount = new Account();
        //when

        int amount;
        funmiAccount.deposit (900);
        funmiAccount.deposit (900);


        assertEquals(1800,funmiAccount.getBalance());
    }

     @Test
        @DisplayName("Test that negative deposit will not work")
            public void negativeDepositTest(){
            Account funmiAccount = new Account();
            funmiAccount.deposit(1000);
            funmiAccount.deposit(-500);
            assertEquals(1000, funmiAccount.getBalance());


            }
            @Test
            public void DepositForWithdrawal(){
            Account funmiAccount = new Account();
            funmiAccount.deposit(5000);
            assertEquals(5000, funmiAccount.getBalance() );
            }

            @Test
            public void Withdrawal(){
            Account funmiAccount = new Account();
            funmiAccount.deposit (5000);
            funmiAccount.withdraw(3000);
             assertEquals(2000, funmiAccount.getBalance());
            }


            @Test
            public void WithdrawalTest(){
            Account funmiAccount = new Account();
            funmiAccount.withdraw(-300);
            assertEquals( 0, funmiAccount.getBalance());

    }
            @Test
          public void WithdrawalBelowBalance(){
        Account funmiAccount = new Account();
        funmiAccount.deposit(5000);
        funmiAccount.withdraw(10000);
        assertEquals(5000, funmiAccount.getBalance());
            }
    }


