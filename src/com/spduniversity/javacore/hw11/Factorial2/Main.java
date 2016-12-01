package com.spduniversity.javacore.hw11.Factorial2;

public class Main {
    public static void main(String[] args) {
        new  Main().go();
    }

    private void go() {
        MainTread mainTread = new MainTread();
        Thread thread = new Thread(mainTread);
        thread.setName("Main Current Thread with sum all threads = " );
        thread.start();
    }
}