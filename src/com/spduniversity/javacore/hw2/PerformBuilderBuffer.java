package com.spduniversity.javacore.hw2;

public class PerformBuilderBuffer {

    public static void main(String[] args) {

        String s = "Rainbow";

        String ns = "Shad" + s.substring(5, 7).concat(" of Life");

        StringBuilder stringBuilder = new StringBuilder("Rainbow");
        stringBuilder.delete(0, 4).insert(0, "Shad").deleteCharAt(4).append(" of Life");


        StringBuffer stringBuffer = new StringBuffer("Rainbow");
        stringBuffer.delete(0, 4).insert(0, "Shad").deleteCharAt(4).append(" of life");

        System.out.println(ns);
        System.out.println(stringBuilder);
        System.out.println(stringBuffer);
    }
}
