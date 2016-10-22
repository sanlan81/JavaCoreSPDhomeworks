package com.spduniversity.javacore.hw3.oop;

class Car {

    private CDPlayer cdPlayer = new CDPlayer();

    void play() {
        cdPlayer.play();
    }

    private String name;
    int distance = 0;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

   /* public void start() {
    }


    public void stop() {
    }
*/


    public int drive(int howlong) {
        return distance = howlong * 60;
    }


    void makeSound() {
        System.out.println("Car beep");
    }
}