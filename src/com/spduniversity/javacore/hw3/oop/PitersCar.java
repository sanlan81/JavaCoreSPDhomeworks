package com.spduniversity.javacore.hw3.oop;


class PitersCar extends Car {
    private String name;

    @Override
    public void setName(String name) {
        // TODO Auto-generated method stub
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int drive(int howlong) {
        return distance = howlong * 180;

    }

    @Override
    void makeSound() {
        System.out.println("Piter's car beep");
    }

}
