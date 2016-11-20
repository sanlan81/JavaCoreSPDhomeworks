package com.spduniversity.javacore.hw7.ZipImputOut.PizzaIO;

import java.util.ArrayList;
import java.util.List;

public class Pizza {
    private String name;
    private String description;
    private List<Ingredient> ingredients = new ArrayList<>();

    Pizza(String name, String description) {
        this.name = name;
        this.description = description;
    }

    @Override
    public String toString() {
        return "Pizza" +
                "name = '" + name + '\'' + "\nDescription " + description +" :"+
                "\n " + ingredients;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

   /* public List<Ingredient> getIngredients() {
        return ingredients;
    }*/

    public int getPrice() {
        int price = 0;
        for (Ingredient ingredient : ingredients) {
            price += ingredient.getPrice();
        }
        return price;
    }

    void addIngridient(Ingredient ingredient) {
        ingredients.add(ingredient);
    }
}
