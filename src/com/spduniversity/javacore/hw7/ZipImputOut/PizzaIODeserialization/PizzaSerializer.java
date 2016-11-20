package com.spduniversity.javacore.hw7.ZipImputOut.PizzaIODeserialization;

import java.io.*;

class PizzaSerializer {
    boolean serializeToFile(Pizza pizza, String filePath) {
        try {
            new File(filePath.substring(0, filePath.lastIndexOf(File.separator))).mkdirs();
            FileOutputStream fout = new FileOutputStream(filePath);
            ObjectOutputStream oos = new ObjectOutputStream(fout);
            oos.writeObject(pizza);
            oos.close();
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    Pizza deserializeFromFile(String filePath) {
        Pizza pizza;
        try {
            FileInputStream fin = new FileInputStream(filePath);
            ObjectInputStream ois = new ObjectInputStream(fin);
            pizza = (Pizza) ois.readObject();
            ois.close();
            return pizza;
        } catch (Exception e) {
            return null;
        }
    }
}
