package com.spduniversity.javacore.hw5.SimpleProxyDemo;


class SimpleProxy implements Interface {
       private Interface proxied;

    SimpleProxy(Interface proxied) {
        this.proxied = proxied;
    }

    @Override
    public void doSomething() {
        System.out.println("SimpleProxy doSomething() Before");
        proxied.doSomething();
        System.out.println("SimpleProxy doSomething() After");
    }

    @Override
    public void doSomethingElse(String arg) {
        System.out.println("SimpleProxy doSomethingElse() Before: arg " + arg);
        proxied.doSomethingElse(arg);
        System.out.println("SimpleProxy doSomethingElse() After: arg " + arg);
    }


}

