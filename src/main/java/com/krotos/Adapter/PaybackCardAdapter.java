package com.krotos.Adapter;

public class PaybackCardAdapter implements CardAdapter {
    private PaybackCard paybackCard = new PaybackCard();

    @Override
    public boolean take(Float amount) {
        return paybackCard.payByPoints(amount);
    }
}
