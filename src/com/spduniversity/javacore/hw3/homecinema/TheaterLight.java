package com.spduniversity.javacore.hw3.homecinema;


public class TheaterLight {
    void on() {
        System.out.println("Включить свет!");
    }


    void off() {
        System.out.println("Выключить свет!");
    }
    void dim(){
        System.out.println("Свет - тусклый");
    }

    @Override
    public String toString() {
        return super.toString();
    }
}

