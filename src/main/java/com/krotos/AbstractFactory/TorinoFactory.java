package com.krotos.AbstractFactory;

public class TorinoFactory extends AbstractFactory {
    @Override
    Pizza orderPizza(String name) {
        Pizza pizza;
        switch (name) {
            case "Capriciosssa":
                pizza = new CapriciossaPizza();
                break;

            default:
                System.out.println("Nie ma");
                pizza = null;
        }
        return pizza;
    }

    @Override
    Pasta orderPasta(String name) {
        Pasta pasta;
        switch (name) {
            case "First":
                pasta = new FirstPasta();
                break;

            default:
                System.out.println("Nie ma");
                pasta = null;
        }
        return pasta;
    }
}
