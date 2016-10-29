package com.spduniversity.javacore.hw6.EnumPizza;


 enum Prise {
    Cheese(10), Sousage(9), Corn(4), Pork(15),Olive(3),Seafood(35);

    private int price;


    Prise(int price) {
        this.price = price;

    }

   int getPrice() {

       return    price;
   }

}
