package com.spduniversity.javacore.hw12.AnnotationCanRun;


import java.lang.reflect.Method;

public class MainAnnotation {
    public static void main(String[] args) {

        AnnotationRunner runner = new AnnotationRunner();
        Class c = runner.getClass();
        Method[] methods = c.getDeclaredMethods();

        for (Method method : methods) {
            CanRun annos = method.getAnnotation(CanRun.class);
            if (annos != null) {
                System.out.println("Run  methods marked annotation : " + method);

                try {
                    method.invoke(runner, annos.text());
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
