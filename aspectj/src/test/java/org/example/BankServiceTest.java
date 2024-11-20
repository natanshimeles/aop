package org.example;


import org.example.example.BankService;
import org.junit.Test;

public class BankServiceTest {
    @Test
    public void testDeposit(){
        BankService bankService = new BankService();
        bankService.deposit(1000);
        bankService.withdraw(500);
    }
}