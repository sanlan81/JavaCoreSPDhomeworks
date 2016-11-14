package com.spduniversity.javacore.hw8.ClassPrinterT;


import java.util.Arrays;

class Printer <T>{

     private T[] massObjects;

    public void print(T[] paramObjects) {
        this.massObjects = paramObjects;

        System.out.println("Printing mass Objects " + Arrays.toString(massObjects));
    }

    @Override
    public String toString() {
        return "Printer{" +
                "massObjects=" + Arrays.toString(massObjects) +
                '}';
    }



 }
