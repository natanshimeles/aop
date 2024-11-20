package org.example.example;


// https://www.baeldung.com/aspectj
public class MainApp {
    public static void main(String[] args) {
        BankService bankService = new BankService();
        bankService.deposit(1000);
        bankService.withdraw(500);
    }
}
