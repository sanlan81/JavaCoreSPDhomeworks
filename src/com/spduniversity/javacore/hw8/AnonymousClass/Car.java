package com.spduniversity.javacore.hw8.AnonymousClass;


 class Car {
      String name;
      int price;

     Car(String name,int price) {
        this.price = price;
        this.name = name;
    }

    @Override
    public String toString() {
        return name + " " + price;
    }


 }
