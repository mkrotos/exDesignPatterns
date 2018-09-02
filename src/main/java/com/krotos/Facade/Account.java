package com.krotos.Facade;

public class Account {

    private long accountNumber;
    private String holderName;
    private Float amountOfFunds;

    @Override
    public String toString() {
        return "Account{" +
                "accountNumber=" + accountNumber +
                ", amountOfFunds=" + amountOfFunds +
                '}';
    }

    public long getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(long accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getHolderName() {
        return holderName;
    }

    public void setHolderName(String holderName) {
        this.holderName = holderName;
    }

    public Float getAmountOfFunds() {
        return amountOfFunds;
    }

    public void setAmountOfFunds(Float amountOfFunds) {
        this.amountOfFunds = amountOfFunds;
    }

    public Account(long accountNumber, String holderName, Float amountOfFunds) {

        this.accountNumber = accountNumber;
        this.holderName = holderName;
        this.amountOfFunds = amountOfFunds;
    }
}
