package com.spduniversity.javacore.hw8.InterfaceStackT;

class ArrayStack<T> implements Stack<T> {

    private final int massSize;
    private int[] stackArray;
    private int top;

    ArrayStack(int m) {
        this.massSize = m;
        stackArray = new int[massSize];
        top = -1;
    }

    @Override
    public void push(T element) {
        System.out.print(element + " ");
        stackArray[++top] = (Integer) element;
    }

    @Override
    public int pop() {
        return stackArray[top--];
    }

    @Override
    public boolean isEmpty() {
        return (top == -1);
    }


}


