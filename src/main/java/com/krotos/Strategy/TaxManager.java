package com.krotos.Strategy;

import java.util.HashMap;
import java.util.Map;

public class TaxManager {

    static TaxStrategy getStrategy(countryCode countryCode) {
        Map<countryCode,TaxStrategy> strategyMap=new HashMap<>();
        strategyMap.put(com.krotos.Strategy.countryCode.PL,new  PLTax());
        strategyMap.put(com.krotos.Strategy.countryCode.USA,new USATax());

        return strategyMap.get(countryCode);
    }
}
