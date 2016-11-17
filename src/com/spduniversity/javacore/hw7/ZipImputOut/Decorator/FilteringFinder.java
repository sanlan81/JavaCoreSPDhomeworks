package com.spduniversity.javacore.hw7.ZipImputOut.Decorator;

import java.io.File;
import java.util.ArrayList;
import java.util.regex.Pattern;

class FilteringFinder extends AbstractFinderDecorator {
    private String filterPattern;

    FilteringFinder(FinderInterface decoratedFinder, String filterPattern) {
        super(decoratedFinder);
        this.filterPattern = filterPattern;
    }

    @Override
    public File[] find(String scanDir) {
        return filter(super.find(scanDir));
    }

    private File[] filter(File[] files) {
        Pattern pattern = Pattern.compile("\\.(" + filterPattern + ")$");
        ArrayList<File> filteredFiles = new ArrayList<File>();

        for (File file: files) {
            if (pattern.matcher(file.getName()).find()) {
                filteredFiles.add(file);
            }
        }

        return filteredFiles.toArray(new File[0]);
    }
}
