package com.spduniversity.javacore.hw7.ZipImputOut.PizzaIODeserialization;

import java.io.File;
import java.util.HashMap;
import java.util.Map;

class IngredientManager {
    private IngredientLoader ingredientLoader;
    private IngredientSerializer ingredientSerializer;
    private Map<String, Ingredient> ingredients = new HashMap<>();

    IngredientManager(IngredientLoader ingredientLoader, IngredientSerializer ingredientSerializer) {
        this.ingredientLoader = ingredientLoader;
        this.ingredientSerializer = ingredientSerializer;
    }

    public void add(Ingredient ingredient) {
        ingredients.put(ingredient.getName(), ingredient);
    }

    public Ingredient get(String name) {
        return ingredients.get(name);
    }

    void loadIngredientsFromDir(String path) {
        File dir = new File(path);
        File[] files = dir.listFiles();
        if (files == null) {
            return;
        }

        Ingredient ingredient;
        for (File file : files) {
            ingredient = ingredientLoader.loadFromFile(file.getAbsolutePath());
            if (ingredient != null) {
                add(ingredient);
            }
        }
    }

    void saveSerializedIngredientsToDir(String path) {
        String fileName;
        for (Map.Entry<String, Ingredient> entry : ingredients.entrySet()) {
            fileName = entry.getValue().getName().toLowerCase() + ".ser";
            ingredientSerializer.serializeToFile(entry.getValue(), path + File.separator + fileName);
        }
    }

    public void loadSerializedIngredientsFromDir(String path) {
        File dir = new File(path);
        File[] files = dir.listFiles();
        if (files == null) {
            return;
        }

        Ingredient ingredient;
        for (File file : files) {
            ingredient = ingredientSerializer.deserializeFromFile(file.getAbsolutePath());
            if (ingredient != null) {
                add(ingredient);
            }
        }
    }

    Map<String, Ingredient> getAll() {
        return ingredients;
    }
}
