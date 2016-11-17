package com.spduniversity.javacore.hw8.InterfaceStackT;


 class StackUtils {

    static Stack<String> reverse(Stack<String> a){
       ArrayStack<String> b = new ArrayStack<>();
       while (!a.isEmpty()){
           try {
               b.push(a.pop());
           } catch (ArrayIndexOutOfBoundsException e) {
               e.printStackTrace();
           }
       }
        //System.out.println(b.arrList);
      return b;
    }

}
