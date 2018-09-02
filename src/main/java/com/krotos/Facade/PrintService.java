package com.krotos.Facade;

public class PrintService {

    void printConfirmation(Account account, Float amount, boolean isSuccess) {
        System.out.println("Print confirmation");
        System.out.println(account.toString());
        System.out.println("Ammount: " + amount);
        System.out.println("Success? " + isSuccess);
    }
}
