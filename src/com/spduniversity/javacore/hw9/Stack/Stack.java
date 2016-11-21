package com.spduniversity.javacore.hw9.Stack;


import java.util.LinkedList;

class Stack<T> {
    private LinkedList<T> list = new LinkedList<>();

    void push(T elem) {
        list.addFirst(elem);
        System.out.println(list);
    }

    T pop() {
        return list.removeFirst();
    }

    T peek() {
        return list.getFirst();
    }

    boolean isEmpty() {
        return list.isEmpty();
    }


    @Override
    public String toString() {
        return list.toString();

    }

}
