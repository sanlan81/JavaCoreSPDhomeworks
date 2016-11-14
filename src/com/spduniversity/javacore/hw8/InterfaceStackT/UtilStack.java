package com.spduniversity.javacore.hw8.InterfaceStackT;

class UtilStack {
    static ArrayStack<Integer> reverse(ArrayStack<Integer> revElement) {

        while (!revElement.isEmpty()){
            int value = revElement.pop();
            System.out.print(value);
            System.out.print(" ");
        }
        return revElement;
    }
}