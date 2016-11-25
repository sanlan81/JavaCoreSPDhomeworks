package com.spduniversity.javacore.hw10.MapBuilderStringInteger;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;

class LoaderWords implements ReservedWordsInterface {

    private Map<String, AtomicInteger> counterMap = new HashMap<>();
    private Map<String, Integer> sortingMap = new TreeMap<>();

    Map<String, Integer> loaderReservedWords(String filePath) {
        Scanner file;

        try {
            file = new Scanner(new File(filePath)).useDelimiter("\\n");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            return null;
        }

        while (file.hasNext()) {
            String line = file.next();
            String[] tokens = line.split("[\\s();,.!=]+");
            for (String token : tokens) {
                String key = token.toLowerCase().trim();


                for (String s : ARRAY_RESERVED_WORDS) {
                    if (key.equals(s)) {

                        counterMap.putIfAbsent(key, new AtomicInteger(0));
                        counterMap.get(key).incrementAndGet();
                    }
                }
            }
        }
        for (Map.Entry<String, AtomicInteger> entry : counterMap.entrySet()) {
            String key = entry.getKey();
            AtomicInteger value = entry.getValue();
            final int a = value.get();

            sortingMap.put(key, a);

        }
        return sortingMap;
    }
}
