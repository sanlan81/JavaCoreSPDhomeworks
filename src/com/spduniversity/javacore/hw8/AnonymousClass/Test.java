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
        list1.add(new Car("Mersedes",5000));


        System.out.println("As we added cars " + list1 +"\n");

        Collections.sort(list1, (one, two) -> one.name.compareTo(two.name));
        System.out.println("Sorted by names  " + list1 +"\n");

                Collections.sort(list1, (o1, o2) -> {
                    if(o1.name.charAt(2) == o2.name.charAt(2)){
                        return o1.price - o2.price;
                    }else{
                        return o1.name.compareTo(o2.name);
                    }
                });
        System.out.println("Sorted by letter 3  " + list1 +"\n");


        Collections.sort(list1, (one, two) -> one.price - two.price);
        System.out.println("Sorted by price  " + list1 );

    }
}
