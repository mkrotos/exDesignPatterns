package com.krotos.Strategy;

public class StrategyMain {
    public static void main(String[] args) {
        System.out.println(Calculator.calculateTax(countryCode.USA,1200f));
        System.out.println(Calculator.calculateTax(countryCode.PL,1200f));
    }
}
