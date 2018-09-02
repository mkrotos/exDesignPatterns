package com.krotos.Facade;

public class FacadeMain {
    public static void main(String[] args) {
        TransactionFacade transactionFacade = new TransactionFacade();
        Account account = new Account(8162761276l, "Bazia", 200f);

        transactionFacade.makeDebitTransaction(account, 100f);
        System.out.println();
        transactionFacade.makeDebitTransaction(account, 200f);
        System.out.println();
    }
}
