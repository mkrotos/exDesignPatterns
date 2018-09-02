package com.krotos.AbstractFactory;

public class SicilianFactory extends AbstractFactory {
    @Override
    Pizza orderPizza(String name) {
        Pizza pizza;
        switch (name) {
            case "Capriciosssa":
                pizza = new CapriciossaPizza();
                break;
            case "Second":
                pizza = new SecondPizza();
                break;
            case "Third":
                pizza = new ThirdPizza();
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
            case "Second":
                pasta = new SecondPasta();
                break;
            case "Third":
                pasta = new ThirdPasta();
                break;
            default:
                System.out.println("Nie ma");
                pasta = null;
        }
        return pasta;
    }
}
