package com.spduniversity.javacore.hw5.FindJDKClasses;

import java.lang.reflect.*;

public class ClassInfarmation {
    public static void main(String[] args) {

        try {
            Class c = Class.forName(args[0]);
            Method[] methods = c.getDeclaredMethods();
            Field[] publicFields = c.getFields();
            Class superClass = c.getSuperclass();
            Class[] intarfaces = c.getInterfaces();

            System.out.println("Name entered class : " + c + "\n");
            System.out.println("---------------------------------");
            for (Method method : methods) {
                System.out.println(method.toString());
            }

            System.out.println("---------------------------------");
            System.out.println("SuperClass  : " + superClass + "\n");
            System.out.println("---------------------------------");

            for (Class cIntarface : intarfaces) {
                System.out.println("Name Interface : " + cIntarface.getName() + "\n");
            }
            System.out.println("---------------------------------");
            for (Field field : publicFields) {
                Class fieldType = field.getType();
                System.out.println("Name  : " + field.getName());
                System.out.println("Type  : " + fieldType.getName());
            }
            System.out.println("=================================");
        } catch (Throwable e) {
            System.err.println(e);
        }

    }
}

