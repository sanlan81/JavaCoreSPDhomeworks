package com.spduniversity.javacore.hw5.SimpleProxyDemo;

public class RealObject implements Interface {

    @Override
    public void doSomething() {
        System.out.println("Print something.");

    }

    @Override
    public void doSomethingElse(String arg)
    {

        System.out.println("Print something else, arg : " + arg);
    }
}
