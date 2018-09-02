package com.krotos.Adapter;

public class AdapterMain {
    public static void main(String[] args) {
        CardAdapter cardAdapter = new DebitCardAdapter();
        System.out.println(cardAdapter.take(120f));

        CardAdapter cardAdapter2 = new PaybackCardAdapter();
        System.out.println(cardAdapter2.take(120f));
        System.out.println(cardAdapter2.take(1200f));
    }

}
