package com.spduniversity.javacore.hw8.InterfaceStackT;


public class Main {
    public static void main(String[] args) {
        ArrayStack<String> arrayStack = new ArrayStack<>();

        arrayStack.push("Hi");
        arrayStack.push("Bye");
        arrayStack.push("Kiss");
        arrayStack.push("Yes");

        //Виводимо перший стек
        System.out.println(arrayStack.arrList);
        System.out.println("--------------------");

        //Виводимо перегорнутий стек
        ArrayStack<String> arrayStack1 = (ArrayStack<String>) StackUtils.reverse(arrayStack);
        System.out.println(arrayStack1.arrList);
    }
}
