package com.spduniversity.javacore.hw7.ZipImputOut.PizzaIODeserialization;

import java.io.File;
import java.util.Map;

public class PizzaRunner {
    public static void main(String[] args) {
        String resDir = System.getProperty("user.dir") + File.separator + "res1";
        String serializedResDir = resDir + File.separator + "serialized";
        String serializedIngredientsResDir = serializedResDir + File.separator + "ingredients";
        String serializedPizzasResDir = serializedResDir + File.separator + "pizzas";

        //!!!!! IMPORTANT !!! This  loading pizzas and ingredients from  txt files and saving to  ser files
        // You should run if arg selected
        String ingredientsResDir = resDir + File.separator + "ingredients";
        String pizzasResDir = resDir + File.separator + "pizzas";

        IngredientLoader ingredientLoader = new IngredientLoader();
        IngredientSerializer ingredientSerializer = new IngredientSerializer();
        IngredientManager ingredientManager = new IngredientManager(ingredientLoader, ingredientSerializer);

        PizzaLoader pizzaLoader = new PizzaLoader(ingredientManager);
        PizzaSerializer pizzaSerializer = new PizzaSerializer();
        PizzaManager pizzaManager = new PizzaManager(pizzaLoader, pizzaSerializer);

        ingredientManager.loadIngredientsFromDir(ingredientsResDir);
        ingredientManager.saveSerializedIngredientsToDir(serializedIngredientsResDir);

        pizzaManager.loadPizzasFromDir(pizzasResDir);
        pizzaManager.saveSerializedPizzasToDir(serializedPizzasResDir);

        //!!!!! IMPORTANT !!! This  loading pizzas and ingredients from ser files
        // You should run if arg didn't selected
     /*   ingredientManager.loadSerializedIngredientsFromDir(serializedIngredientsResDir);
        pizzaManager.loadSerializedPizzasFromDir(serializedPizzasResDir);*/


        //Read from the Files
        // We would like to know our base pizza names their  descriptions and ingredients prices
        for (Map.Entry entry : pizzaManager.getAll().entrySet()) {
            System.out.println("We have one of our base pizzas : ");
            System.out.println(entry.getValue());
        }
        System.out.println("\n=========================== \nWe wants to make own pizza so we have for this:\n");
        // We didn't like our base pizzas  we would like  to make  our ouw pizza so
        // Read from the Files all ingredients and their prices
        for (Map.Entry entry : ingredientManager.getAll().entrySet()) {
            System.out.println(entry.getValue().toString());
        }
        System.out.println("\n=========================== ");

        //Well after thinking we decided  to order some of these ingredients here it is our total price
        System.out.println(" Your  Total Praise : " + (ingredientManager.get("Cheese").getPrice() +
                ingredientManager.get("Cheese").getPrice() + ingredientManager.get("Pork").getPrice() +
                ingredientManager.get("Cucumber").getPrice() + ingredientManager.get("Cucumber").getPrice() +
                ingredientManager.get("Sausage").getPrice()) + " $");


    }
}
