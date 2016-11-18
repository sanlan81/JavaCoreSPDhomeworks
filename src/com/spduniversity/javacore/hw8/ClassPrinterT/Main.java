package com.spduniversity.javacore.hw8.ClassPrinterT;


public class Main {

    public static void main(String[] args) {
        Printer<ObgectForT> printer = new Printer<>();
        ObgectForT[] massObjects = new ObgectForT[4];

        for (int i = 0; i < massObjects.length; i++) {
            massObjects[i] = new ObgectForT();
        }
        printer.print(massObjects);
    }
}
