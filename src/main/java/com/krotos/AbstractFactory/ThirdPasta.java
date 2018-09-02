package com.krotos.AbstractFactory;

import java.util.ArrayList;
import java.util.List;

public class ThirdPasta implements Pasta {
    @Override
    public List<String> getIngredients() {
        List<String> list=new ArrayList<>();
        list.add("Cheese");
        list.add("Cheese");
        list.add("Bacon");
        list.add("Tomato sauce");

        return list;
    }
}
