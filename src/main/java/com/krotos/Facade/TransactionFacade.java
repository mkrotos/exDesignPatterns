package com.krotos.Facade;


public class TransactionFacade {
    private AccountService accountService=new AccountService();
    private NotifyService notifyService=new NotifyService();
    private PrintService printService=new PrintService();

    boolean makeDepositTransaction(Account account, Float amount){
        String operationName="Deposit";
        boolean isSuccess=accountService.deposit(account,amount);
        notifyService.sendSMSNotification(account,operationName);
        printService.printConfirmation(account,amount,isSuccess);
        return isSuccess;
    }

    boolean makeDebitTransaction(Account account, Float amount){
        String operationName="Debit";
        boolean isSuccess=accountService.debitAccount(account,amount);
        notifyService.sendSMSNotification(account,operationName);
        printService.printConfirmation(account,amount,isSuccess);
        return isSuccess;
    }

}
