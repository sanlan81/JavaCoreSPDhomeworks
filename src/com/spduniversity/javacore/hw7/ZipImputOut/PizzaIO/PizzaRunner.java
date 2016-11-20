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

        //Почитаемо з файл?в
        // Подивимось як? п?цци у нас є ? що у них за ?нгр?д?енти т? ц?на
        for (Map.Entry entry : pizzaManager.getAll().entrySet()) {
            System.out.println("We have one of our base pizzas : ");
            System.out.println(entry.getValue());
        }
        System.out.println("\n=========================== \nWe wonts to make ouwn pizza so we have for this:\n");
        //Почитаємо що за  ?нгр?д?енти та ц?на лежать у файлах
        // Виводимо увесь список  ?нгр?д?ент?в щоб з?брати  власну П?цу
        for (Map.Entry entry : ingredientManager.getAll().entrySet()) {
            System.out.println(entry.getValue().toString());
        }
        System.out.println("\n=========================== ");

        //Закажемо 2 сиру + Свинина + Ог?рок +  1 сос?ска
        System.out.println(" Your  Total Praise : " + (ingredientManager.get("Cheese").getPrice() +
                ingredientManager.get("Cheese").getPrice() + ingredientManager.get("Pork").getPrice() +
                ingredientManager.get("Cucumber").getPrice() + ingredientManager.get("Cucumber").getPrice() +
                ingredientManager.get("Sausege").getPrice()) + " $");
    }
}
