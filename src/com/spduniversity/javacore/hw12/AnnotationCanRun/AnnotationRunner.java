package com.spduniversity.javacore.hw12.AnnotationCanRun;

class AnnotationRunner {
    @CanRun
    void method1(String text) {
        System.out.println("method 1 : " + text);
    }

    void method2() {

    }

    @CanRun(text = "My text")
    void method3(String text) {
        System.out.println("method 3 : " + text);
    }

    void method4() {

    }

    void method5() {

    }
}
