package com.spduniversity.javacore.hw9.Stack;


public class Main {
    public static void main(String[] args) {

        Stack<String> stringStack = new Stack<>();

        String str = "Don't worry, Java for me.";

        //Push string  to LinkedList and let's see it!
        for (String s : str.split(" ")) {
            stringStack.push(s);

        }

        //Let's see what  on the top without delete
        System.out.println(stringStack.peek());


        // Well... if Stack is not empty so cut every elem
        while (!stringStack.isEmpty()) {
            stringStack.pop();

        }

    }
}
