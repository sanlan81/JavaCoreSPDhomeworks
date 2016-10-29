package com.spduniversity.javacore.hw6.EnumPizza;

import java.util.Arrays;

enum Order {
    Americano(Ingridients.Americano.class),
    Italliano(Ingridients.Italliano.class),
    OwnPizza(Ingridients.OwnPizza.class);

    private Ingridients[] values;

    // private constructor!
    Order(Class<? extends Ingridients> kind) {
        values = kind.getEnumConstants();
    }

    @Override
    public String toString() {
        return "Ingridients :" + Arrays.toString(values);
    }
}
