package com.spduniversity.javacore.hw3.homecinema;

/**
 * Created by Sasha on 19.10.2016.
 */
public class Tuner {
    boolean on() {
        return true;
    }


    boolean off() {
        System.out.println("Тюнер отключен");

        return false;
    }
    void  setAm(){
    }
    void  setFm(){

    }
    void  setFrequency(){

    }
    @Override
    public String toString() {
        return super.toString();
    }
}
