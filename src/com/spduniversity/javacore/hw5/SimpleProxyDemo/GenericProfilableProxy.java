package com.spduniversity.javacore.hw5.SimpleProxyDemo;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class GenericProfilableProxy<T> {

    private T proxy;
    private T obj;
    private Map<String, Integer> methodInvocationsCount = new HashMap<>();
    private Map<String, List<Integer>> methodInvocationsDurations = new HashMap<>();

    GenericProfilableProxy(Class<T> intf, final T obj) {
        proxy = createProxyInstance(intf, obj);
        this.obj = obj;
    }

    public T getProxy() {
        return proxy;
    }

    void printMethodInvocationsCount() {
        System.out.println(" =========================== ");
        System.out.println("Method invocations count for object " + obj.getClass());
        for (Map.Entry<String, Integer> entry : methodInvocationsCount.entrySet()) {
            System.out.println("Method '" + entry.getKey() + "': " + entry.getValue() + " times");

        }
    }

    void printMethodInvocationsDurations() {
        System.out.println(" --------------------------");
        System.out.println("Method invocations durations for object " + obj.getClass());
        for (Map.Entry<String, List<Integer>> entry : methodInvocationsDurations.entrySet()) {
            int i = 0;
            for (Integer duration : entry.getValue()) {
                float durationInMs = duration / 1000000.0f;
                System.out.println("Method '" + entry.getKey() + "', invocation #" + i + " duration: " +
                        durationInMs + " ms");


                i++;
            }
        }
    }

    private T createProxyInstance(Class<T> intf, final T obj) {
        return (T) Proxy.newProxyInstance(obj.getClass().getClassLoader(),
                new Class[]{intf},
                new InvocationHandler() {
                    public Object invoke(Object proxy, Method method,
                                         Object[] args) throws Throwable {
                        int invocationsCount = 0;
                        if (methodInvocationsCount.containsKey(method.getName())) {
                            invocationsCount = methodInvocationsCount.get(method.getName());
                        }
                        methodInvocationsCount.put(method.getName(), invocationsCount + 1);

                        long startTime = System.nanoTime();
                        Object result = method.invoke(obj, args);
                        int invocationDuration = (int) (System.nanoTime() - startTime);
                        if (!methodInvocationsDurations.containsKey(method.getName())) {
                            methodInvocationsDurations.put(method.getName(), new ArrayList<Integer>());
                        }
                        methodInvocationsDurations.get(method.getName()).add(invocationDuration);

                        return result;
                    }
                });
    }
}