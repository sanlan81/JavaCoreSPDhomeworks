package com.spduniversity.javacore.hw9.TreeSetDemoComparatorAnonymousClass;

import java.util.*;

public class TreeSetDemo {
    private Set<Car> carsDefault = new TreeSet<>();

    private Set<Car> carsComparator1 = new TreeSet<>((one, two) -> {
        if ((one.getYear() == two.getYear()) & (two.getBrand().equals(one.getBrand()))){
            return one.getPrice() - two.getPrice();
        } else {
            return two.getBrand().compareTo(one.getBrand());
        }
    });
    private Set<Car> carsComparator2 = new TreeSet<>(new Comparator<Car>() {
        @Override
        public int compare(Car one, Car two) {
            if ((one.getYear() == two.getYear()) & (two.getBrand().equals(one.getBrand()))){
                return two.getPrice() - one.getPrice();
            } else {
                return one.getBrand().compareTo(two.getBrand());
            }
        }
        @Override
        public Comparator<Car> reversed() {
            return (o1, o2) -> (o2).getName().compareTo((o1).getName());
        }
    });

    private LinkedList<Car> list = new LinkedList<>();

    public static void main(String[] args) {
        new TreeSetDemo().go();
    }

    private void go() {
        list.add(new Car("118i", 25000, "BMW", 2015));
        list.add(new Car("118i", 2000, "BMW", 2015));
        list.add(new Car("118i", 7000, "BMW", 2015));
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
        System.out.println("\nSorting by Price  Asc  if  brands names and Years equals  : \n");

        //Sorting by price  Asc  if  brands names and years equals
        carsComparator1.forEach(System.out::println);
        System.out.println("\nSorting by price  Desc  if  brands names and years equals  : \n");

        //Sorting by price  Desc  if  brands names and years equals
        carsComparator2.forEach(System.out::println);

    }
}
