package com.spduniversity.javacore.hw7.ZipImputOut.Decorator;

import java.io.File;

class AbstractFinderDecorator implements FinderInterface {
    private FinderInterface decoratedFinder;

    AbstractFinderDecorator(FinderInterface decoratedFinder) {
        this.decoratedFinder = decoratedFinder;
    }

    @Override
    public File[] find(String scanDir) {
        return decoratedFinder.find(scanDir);
    }
}
