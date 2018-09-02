package com.krotos.Adapter;

public class PaybackCard {

    private Float points = 5000f;
    private Float conversionRatio = 10f;

    boolean payByPoints(Float amount) {
        Float amountInPoints = amount * conversionRatio;
        if (amountInPoints > points) {
            return false;
        }
        points -= amountInPoints;
        return true;
    }
}
