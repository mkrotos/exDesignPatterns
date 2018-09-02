package com.krotos.Strategy;

import java.util.HashMap;
import java.util.Map;

public class TaxManager {

    static TaxStrategy getStrategy(CountryCode countryCode) {
        Map<CountryCode, TaxStrategy> strategyMap = new HashMap<>();
        strategyMap.put(countryCode.PL, new PLTax());
        strategyMap.put(countryCode.USA, new USATax());

        return strategyMap.get(countryCode);
    }

    static float calculateTax(CountryCode code, Float income) {
        TaxStrategy taxStrategy = getStrategy(code);
        return taxStrategy.calculate(income);
    }

}
