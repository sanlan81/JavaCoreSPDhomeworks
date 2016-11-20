package com.spduniversity.javacore.hw7.ZipImputOut.PizzaIO;

import java.io.File;
import java.util.HashMap;
import java.util.Map;

public class IngredientManager {
    private IngredientLoader ingredientLoader;
    private Map<String, Ingredient> ingredients = new HashMap<String, Ingredient>();

    IngredientManager(IngredientLoader ingredientLoader) {
        this.ingredientLoader = ingredientLoader;
    }

    public void add(Ingredient ingredient) {
        ingredients.put(ingredient.getName(), ingredient);
    }


    public Ingredient get(String name) {
        return ingredients.get(name);
    }

     Map<String, Ingredient> getAll(){

        return  ingredients;
    }

    public void loadIngredientsFromDir(String path) {
        File dir = new File(path);
        File[] files = dir.listFiles();
        if (files == null) {
            return;
        }

        Ingredient ingredient;
        for (File file: files) {
            ingredient = ingredientLoader.loadFromFile(file.getAbsolutePath());
            if (ingredient != null) {
                add(ingredient);
            }
        }
    }
}
