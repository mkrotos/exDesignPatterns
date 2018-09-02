package com.krotos.Adapter;

public class DebitCardAdapter implements CardAdapter {
    private DebitCard debitCard = new DebitCard();

    @Override
    public boolean take(Float amount) {
        return debitCard.takeMoney(amount);
    }
}
