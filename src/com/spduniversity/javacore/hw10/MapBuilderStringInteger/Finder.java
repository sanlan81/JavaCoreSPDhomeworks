package com.spduniversity.javacore.hw10.MapBuilderStringInteger;


import java.io.File;

 class Finder implements FinderInterface{
    @Override
    public File find(String scanFile) {
        File file = new File(scanFile);
        if (file.isFile()){
            return file;
        }
        return null;
    }


}
