package com.spduniversity.javacore.hw7.ZipImputOut.PizzaIO;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class PizzaLoader {
    private IngredientManager ingredientManager;

    PizzaLoader(IngredientManager ingredientManager) {
        this.ingredientManager = ingredientManager;
    }

    public Pizza loadFromFile(String filePath) {
        Scanner file;
        String line, key, value;
        String[] tokens;

        String name = "";
        String description = "";
        String[] ingredients = {};

        try {
            file = new Scanner(new File(filePath)).useDelimiter("\\n");
        } catch (FileNotFoundException e) {
            return null;
        }

        while (file.hasNext()) {
            line = file.next();
            tokens = line.split(":");
            if (tokens.length != 2) {
                file.close();
                return null;
            }
            key = tokens[0].toLowerCase();
            value = tokens[1].trim();
            if (key.equals("name")) {
                name = value;
            } else if (key.equals("description")) {
                description = value;
            } else if (key.equals("ingredients")) {
                ingredients = value.split(",");
            }
        }
        file.close();

        if (name.equals("") || description.equals("") || ingredients.length == 0) {
            return null;
        }

        Pizza pizza = new Pizza(name, description);

        Ingredient ingredient;
        for (String ingredientName: ingredients) {
            ingredient = ingredientManager.get(ingredientName.trim());
            if (ingredient != null) {
                pizza.addIngridient(ingredient);
            }
        }

        return pizza;
    }
}
