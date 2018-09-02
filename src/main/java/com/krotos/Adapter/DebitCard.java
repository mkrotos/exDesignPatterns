package com.krotos.Adapter;

public class DebitCard {

    private Float moneys=1000f;

    boolean takeMoney(Float amount){
        if(amount>moneys){
            return false;
        }
        moneys-=amount;
        return true;
    }
}
