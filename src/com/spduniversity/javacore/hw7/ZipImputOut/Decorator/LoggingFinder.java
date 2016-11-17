package com.spduniversity.javacore.hw7.ZipImputOut.Decorator;

import java.io.File;

class LoggingFinder extends AbstractFinderDecorator {
    LoggingFinder(FinderInterface decoratedFinder) {
        super(decoratedFinder);
    }

    @Override
    public File[] find(String scanDir) {
        System.out.println("Scanning dir " + scanDir + " for files");
        File[] files = super.find(scanDir);
        if (files.length <= 0) {
            System.out.println("No files found");
        } else {
            for (File file : files) {
                System.out.println("Found file " + file.getName());
            }
        }
        return files;
    }
}
