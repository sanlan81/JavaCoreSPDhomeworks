package com.spduniversity.javacore.hw8.InterfaceStackT;


import java.util.*;

 class ArrayStack<T> implements Stack<T>{

   List<T> arrList = new ArrayList<>();
    @Override
    public boolean isEmpty() {
        return arrList.isEmpty();
    }

    @Override
    public void push(T a) {
         arrList.add(a);
    }

    @Override
    public T pop() throws ArrayIndexOutOfBoundsException{

        return arrList.remove(arrList.size()-1);

    }


}
