package com.spduniversity.javacore.hw7.ZipImputOut.Decorator;

import java.io.File;

class Finder implements FinderInterface {
    public File[] find(String scanDir) {
        File file = new File(scanDir);
        if (file.isDirectory()) {
            return file.listFiles();
        }
        return null;
    }
}
