package com.spduniversity.javacore.hw5.SimpleProxyDemo;

class SimpleProxyDemo {
    private static void consumer(Interface iface) {
        iface.doSomething();
        iface.doSomethingElse("My args");
    }

    public static void main(String[] args) {
        GenericProfilableProxy<Interface> realObjectProxy =
                new GenericProfilableProxy<>(Interface.class, new RealObject());
        GenericProfilableProxy<Interface> simpleProxyProxy =
                new GenericProfilableProxy<>(Interface.class, new SimpleProxy(new RealObject()));

        consumer(realObjectProxy.getProxy());
        consumer(simpleProxyProxy.getProxy());

        realObjectProxy.printMethodInvocationsCount();
        realObjectProxy.printMethodInvocationsDurations();
        simpleProxyProxy.printMethodInvocationsCount();
        simpleProxyProxy.printMethodInvocationsDurations();
    }
}
