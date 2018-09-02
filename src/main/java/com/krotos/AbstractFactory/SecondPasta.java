package com.krotos.AbstractFactory;

import java.util.ArrayList;
import java.util.List;

public class SecondPasta implements Pasta {
    @Override
    public List<String> getIngredients() {
        List<String> list = new ArrayList<>();
        list.add("Cheese");
        list.add("Bacon");
        list.add("Sour cream");

        return list;
    }
}
