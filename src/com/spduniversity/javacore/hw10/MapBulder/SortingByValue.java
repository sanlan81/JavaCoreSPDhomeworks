package com.spduniversity.javacore.hw10.MapBulder;


import java.util.*;

class SortingByValue {
    <K, V extends Comparable<? super V>> Map<String, Integer> sortByValue(Map<String, Integer> map) {
        List<Map.Entry<String, Integer>> list =
                new LinkedList<>(map.entrySet());
        Collections.sort(list, (o1, o2) -> o1.getValue() - o2.getValue());

        Map<String,Integer> result = new LinkedHashMap<>();
        for (Map.Entry<String, Integer> entry : list) {
            result.put(entry.getKey(), entry.getValue());
        }
        return result;
    }
}
