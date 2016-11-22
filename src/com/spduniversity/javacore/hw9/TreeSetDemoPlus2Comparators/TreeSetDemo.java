package com.spduniversity.javacore.hw9.TreeSetDemoPlus2Comparators;

import java.util.*;

public class TreeSetDemo {
    private Set<Car> carsDefault = new TreeSet<>();
    private Set<Car> carsComparator1 = new TreeSet<>(new ReleaseDateAscComparator());
    private Set<Car> carsComparator2 = new TreeSet<>(new ReleaseDateDescComparator());

    private LinkedList<Car> list = new LinkedList<>();

    private class ReleaseDateAscComparator implements Comparator<Car> {

        @Override
        public int compare(Car one, Car two) {
            if (one.getYear() != two.getYear()) {
                return one.getYear() - two.getYear();
            } else {
                return two.getBrand().compareTo(one.getBrand());
            }
        }
    }

    private class ReleaseDateDescComparator implements Comparator<Car> {

        @Override
        public int compare(Car one, Car two) {
            if (one.getYear() != two.getYear()) {
                return two.getYear() - one.getYear();
            } else {
                return one.getBrand().compareTo(two.getBrand());
            }
        }
    }

    public static void main(String[] args) {
        new TreeSetDemo().go();
    }

    private void go() {
        list.add(new Car("118i", 25000, "BMW", 2015));
        list.add(new Car("118i", 25000, "BMW", 2010));
        list.add(new Car("Astra", 20000, "Opel", 1990));
        list.add(new Car("Lx300", 100000, "Lexus", 2016));
        list.add(new Car("Lx300", 100000, "Alfa Romeo", 2016));

        carsDefault.addAll(list);
        carsComparator1.addAll(list);
        carsComparator2.addAll(list);
        System.out.println("Default Sorting   : \n");

        //Default Sorting
        carsDefault.forEach(System.out::println);
        System.out.println("\nSorting by years Asc and if years equals sorting by brands names Desc  : \n");

        //Sorting by Years Asc  and Desc brands names if Years equals
        carsComparator1.forEach(System.out::println);
        System.out.println("\nSorting by years Desc and if years equals sorting by brands names Asc  : \n");

        //Sorting by Years Asc  and Desc brands names if Years equals
        carsComparator2.forEach(System.out::println);

    }
}
