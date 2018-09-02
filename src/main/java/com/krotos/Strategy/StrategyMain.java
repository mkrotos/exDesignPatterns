package com.krotos.Strategy;

public class StrategyMain {
    public static void main(String[] args) {
        System.out.println(TaxManager.calculateTax(CountryCode.USA, 1200f));
        System.out.println(TaxManager.calculateTax(CountryCode.PL, 1200f));
    }
}
