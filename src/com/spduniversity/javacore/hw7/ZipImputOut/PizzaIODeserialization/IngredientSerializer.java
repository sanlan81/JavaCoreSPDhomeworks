package com.spduniversity.javacore.hw7.ZipImputOut.PizzaIODeserialization;

import java.io.*;

class IngredientSerializer {
    boolean serializeToFile(Ingredient ingredient, String filePath) {
        try {
            new File(filePath.substring(0, filePath.lastIndexOf(File.separator))).mkdirs();
            FileOutputStream fout = new FileOutputStream(filePath);
            ObjectOutputStream oos = new ObjectOutputStream(fout);
            oos.writeObject(ingredient);
            oos.close();
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    Ingredient deserializeFromFile(String filePath) {
        Ingredient ingredient;
        try {
            FileInputStream fin = new FileInputStream(filePath);
            ObjectInputStream ois = new ObjectInputStream(fin);
            ingredient = (Ingredient) ois.readObject();
            ois.close();
            return ingredient;
        } catch (Exception e) {
            return null;
        }
    }
}
