package com.krotos.AbstractFactory;

public class FactoryProducer {

    static AbstractFactory getFactory(String name) {
        switch (name) {
            case "Sicilian":
                return new SicilianFactory();
            case "Torino":
                return new TorinoFactory();
            default:
                return null;
        }
    }
}
