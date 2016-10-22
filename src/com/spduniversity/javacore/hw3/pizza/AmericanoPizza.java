package com.spduniversity.javacore.hw3.pizza;

public class AmericanoPizza extends PizzaHot {

    public AmericanoPizza(int cheese, int sausege, int olive) {
        this.Cheese = cheese;
        this.Sausege = sausege;
        this.Olive = olive;

    }

    @Override
    int getTotalIngridients() {

        return Cheese + Sausege + Olive;
    }





}
