package com.spduniversity.javacore.hw7.ZipImputOut.PizzaIO;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class IngredientLoader {
    public Ingredient loadFromFile(String filePath) {
        Scanner file;
        String line, key, value;
        String[] tokens;

        String name = "";
        String description = "";
        int price = 0;

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
            } else if (key.equals("price")) {
                price = Integer.parseInt(value);
            }
        }
        file.close();

        if (name.equals("") || description.equals("") || price == 0) {
            return null;
        }

        return new Ingredient(name, description, price);
    }
}
