package com.spduniversity.javacore.hw7.ZipImputOut.PizzaIO;

import java.io.File;
import java.util.HashMap;
import java.util.Map;

class PizzaManager {
    private PizzaLoader pizzaLoader;
    private Map<String, Pizza> pizzas = new HashMap<>();

    PizzaManager(PizzaLoader pizzaLoader) {
        this.pizzaLoader = pizzaLoader;
    }

    public void add(Pizza pizza) {
        pizzas.put(pizza.getName(), pizza);
    }

    public Pizza get(String name) {
        return pizzas.get(name);
    }

    Map<String, Pizza> getAll() {

        return pizzas;
    }

    void loadPizzasFromDir(String path) {
        File dir = new File(path);
        File[] files = dir.listFiles();
        if (files == null) {
            return;
        }

        Pizza pizza;
        for (File file : files) {
            pizza = pizzaLoader.loadFromFile(file.getAbsolutePath());
            if (pizza != null) {
                add(pizza);
            }
        }
    }
}
