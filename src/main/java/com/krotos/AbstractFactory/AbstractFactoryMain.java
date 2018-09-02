package com.krotos.AbstractFactory;

public class AbstractFactoryMain {
    public static void main(String[] args) {

        AbstractFactory factory=FactoryProducer.getFactory("Sicilian");
        System.out.println(factory.orderPizza("Second").getIngredients());
    }
}
