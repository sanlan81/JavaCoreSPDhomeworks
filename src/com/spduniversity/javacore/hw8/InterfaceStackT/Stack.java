package com.spduniversity.javacore.hw8.InterfaceStackT;


 interface Stack<T> {
    boolean isEmpty();
   void  push(T a);
    T pop() throws ArrayIndexOutOfBoundsException;
}
