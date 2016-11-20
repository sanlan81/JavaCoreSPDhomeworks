package com.spduniversity.javacore.hw7.ZipImputOut.PizzaIO;

import java.io.File;
import java.util.Map;

public class PizzaRunner {


    public static void main(String[] args) {
        new PizzaRunner().go();
    }

    private void go() {
        String resDir = System.getProperty("user.dir") + File.separator + "res";
        String ingredientsResDir = resDir + File.separator + "ingredients";
        String pizzasResDir = resDir + File.separator + "pizzas";


        IngredientLoader ingredientLoader = new IngredientLoader();

        IngredientManager ingredientManager = new IngredientManager(ingredientLoader);
        PizzaLoader pizzaLoader = new PizzaLoader(ingredientManager);

        PizzaManager pizzaManager = new PizzaManager(pizzaLoader);


        ingredientManager.loadIngredientsFromDir(ingredientsResDir);
        pizzaManager.loadPizzasFromDir(pizzasResDir);

        //Read from the Files
        // We would like to know our base pizza names their  descriptions and ingredients prices
        for (Map.Entry entry : pizzaManager.getAll().entrySet()) {
            System.out.println("We have one of our base pizzas : ");
            System.out.println(entry.getValue());
        }
        System.out.println("\n=========================== \nWe wonts to make ouwn pizza so we have for this:\n");
        // We didn' t like our base pizzas  we would like  to make  our ouw pizza so
        // Read from the Files all ingredients and their prices
        for (Map.Entry entry : ingredientManager.getAll().entrySet()) {
            System.out.println(entry.getValue().toString());
        }
        System.out.println("\n=========================== ");

        //Well after thinking we decided  to order some of these ingredients here it is our total price
        System.out.println(" Your  Total Praise : " + (ingredientManager.get("Cheese").getPrice() +
                ingredientManager.get("Cheese").getPrice() + ingredientManager.get("Pork").getPrice() +
                ingredientManager.get("Cucumber").getPrice() + ingredientManager.get("Cucumber").getPrice() +
                ingredientManager.get("Sausege").getPrice()) + " $");
    }
}
