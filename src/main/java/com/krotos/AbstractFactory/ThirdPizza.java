package com.krotos.AbstractFactory;

import java.util.ArrayList;
import java.util.List;

public class ThirdPizza implements Pizza {
    @Override
    public List<String> getIngredients() {
        List<String> list=new ArrayList<>();
        list.add("Cheese");
        list.add("Cheese");
        list.add("Tomato sauce");
        list.add("Mushrooms");
        list.add("Chicken");

        return list;
    }
}
