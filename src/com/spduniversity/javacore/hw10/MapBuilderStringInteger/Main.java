package com.spduniversity.javacore.hw10.MapBuilderStringInteger;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        SortingByValue sortingByValue = new SortingByValue();

        String javaFile = args[0];
        Finder finder = new Finder();
        System.out.println("You are running this file on this path : \n" + finder.find(javaFile));
        Map<String, Integer> map =
                new LoaderWords().loaderReservedWords(String.valueOf(finder.find(javaFile)));

        System.out.println("\nSorting by Key : \n" + map);
        System.out.println("\nSorting by Value : \n" + sortingByValue.sortByValue(map));
    }
}
