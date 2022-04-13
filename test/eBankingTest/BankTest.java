package eBankingTest;

import eBanking.Bank;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;


public class BankTest {
    private Bank gtBank;
    @BeforeEach
    public void setUp(){
        gtBank = new Bank("GtBank",10);
    }

    @Test
    public void bankCanBeCreated(){
        Bank gtBank = new Bank("GtBank",10);
        assertNotNull(gtBank);

    }
}
