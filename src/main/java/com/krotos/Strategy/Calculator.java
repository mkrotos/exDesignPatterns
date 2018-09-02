package com.krotos.Strategy;

public class Calculator {

    static float calculateTax(countryCode code,Float income){
        TaxStrategy taxStrategy=TaxManager.getStrategy(code);
        return taxStrategy.calculate(income);
    }
}
