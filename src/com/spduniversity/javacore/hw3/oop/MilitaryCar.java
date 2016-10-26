package com.spduniversity.javacore.hw3.oop;

class MilitaryCar extends Car implements Controlling{


    int currentSubmergeDepth;
    boolean isGunOnBoard = true;


    //Погружается умеет нырять на определенную глубину
    void submerge(){
        currentSubmergeDepth = 50;
    }

    //void surface(){
    //}

    void makeSound() {
        System.out.println("Такая сигналка что уши пухнут у окружаюших!");
    }

    public void voiceConnection() {
        System.out.println("This car understand voice command \"Engine  on!!!\"");
    }
}
