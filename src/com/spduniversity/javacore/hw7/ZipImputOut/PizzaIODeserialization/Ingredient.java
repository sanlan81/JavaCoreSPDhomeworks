package com.spduniversity.javacore.hw7.ZipImputOut.PizzaIODeserialization;

import java.io.Serializable;

public class Ingredient implements Serializable {
    private String name;
    private String description;
    private int price;

    Ingredient(String name, String description, int price) {
        this.name = name;
        this.description = description;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Ingredient : " +
                "name = '" + name + '\'' +
                "  price = " + price + "$\n";
    }
}
