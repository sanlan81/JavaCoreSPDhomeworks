package com.spduniversity.javacore.hw7.ZipImputOut.PizzaIODeserialization;

import java.io.File;
import java.util.HashMap;
import java.util.Map;

class PizzaManager {
    private PizzaLoader pizzaLoader;
    private PizzaSerializer pizzaSerializer;
    private Map<String, Pizza> pizzas = new HashMap<>();

    PizzaManager(PizzaLoader pizzaLoader, PizzaSerializer pizzaSerializer) {
        this.pizzaLoader = pizzaLoader;
        this.pizzaSerializer = pizzaSerializer;
    }

    public void add(Pizza pizza) {
        pizzas.put(pizza.getName(), pizza);
    }

    public Pizza get(String name) {
        return pizzas.get(name);
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

    void saveSerializedPizzasToDir(String path) {
        String fileName;
        for (Map.Entry<String, Pizza> entry : pizzas.entrySet()) {
            fileName = entry.getValue().getName().toLowerCase() + ".ser";
            pizzaSerializer.serializeToFile(entry.getValue(), path + File.separator + fileName);
        }
    }

    public void loadSerializedPizzasFromDir(String path) {
        File dir = new File(path);
        File[] files = dir.listFiles();
        if (files == null) {
            return;
        }

        Pizza pizza;
        for (File file : files) {
            pizza = pizzaSerializer.deserializeFromFile(file.getAbsolutePath());
            if (pizza != null) {
                add(pizza);
            }
        }
    }

    Map<String, Pizza> getAll() {
        return pizzas;
    }
}
