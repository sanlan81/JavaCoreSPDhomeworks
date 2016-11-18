package com.spduniversity.javacore.hw8.ClassPrinterT;

class Printer<T> {

    public <T extends Printable> void print(T[] arrayObjects) {

        System.out.println("Array Objects : " );

        for (T arr : arrayObjects) {
           arr.print();

        }
    }
}
