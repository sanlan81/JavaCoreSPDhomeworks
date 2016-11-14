package com.spduniversity.javacore.hw8.AnonymousClass;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Test {

    public static void main(String[] args) {
        new Test().go();
    }

    private void go() {
        List<Car> list1 = new ArrayList<>();

        list1.add(new Car("Sitroen",700));
        list1.add(new Car("Ferrary",60000));
        list1.add(new Car("Bmw",1000));
        list1.add(new Car("Mazda",5000));


        System.out.println("As we added cars " + list1 +"\n");

        Collections.sort(list1, (one, two) -> one.name.compareTo(two.name));
        System.out.println("Sorted by names  " + list1 +"\n");


        Collections.sort(list1, (one, two) -> one.price - two.price);
        System.out.println("Sorted by price  " + list1 );

    }
}
