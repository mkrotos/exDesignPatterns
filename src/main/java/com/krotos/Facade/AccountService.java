package com.krotos.Facade;

public class AccountService {

    boolean debitAccount(Account account,Float amount){
        if(account==null){
            System.out.println("Nie ma konta");
            return false;
        }
        if(amount>account.getAmountOfFunds()){
            System.out.println("Nie ma środków");
            return false;
        }
        account.setAmountOfFunds(account.getAmountOfFunds()-amount);
        return true;
    }

    boolean deposit(Account account, Float amount){
        if(account==null){
            System.out.println("Nie ma konta");
            return false;
        }
        account.setAmountOfFunds(account.getAmountOfFunds()+amount);
        return true;
    }
}
