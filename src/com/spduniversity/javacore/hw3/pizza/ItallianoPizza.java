package com.spduniversity.javacore.hw3.pizza;

public class ItallianoPizza extends PizzaHot {
    public ItallianoPizza(int cheese, int cucumber, int pork) {
        this.Cheese = cheese;
        this.Pork = pork;
        this.Cucumber = cucumber;
    }

    @Override
    int getTotalIngridients() {
        return Cheese + Pork + Cucumber;
    }


}
