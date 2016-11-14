package com.spduniversity.javacore.hw8.InterfaceStackT;

public class Main {

    public static void main(String[] args) {
        ArrayStack<Integer> mStack = new ArrayStack<>(10);


        mStack.push(1);
        mStack.push(2);
        mStack.push(3);
        mStack.push(4);
        System.out.println();
        System.out.println("-------");

         UtilStack.reverse(mStack);
    }
}

