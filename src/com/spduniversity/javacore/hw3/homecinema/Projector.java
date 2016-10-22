package com.spduniversity.javacore.hw3.homecinema;

/**
 * Created by Sasha on 19.10.2016.
 */
public class Projector {
    DVDPlayer dvdPlayer;
    void on() {

        System.out.println("Включить проэктор.");
    }


    void off() {
        System.out.println("Выключить проэктор.");
    }

    void tvMode(){
        System.out.println("Связать вход проектора  с выходом  DVD");
    }
    void wideScreenMode(){
        System.out.println("Включить fullscreen на проекторе!");

    }

    @Override
    public String toString() {
        return super.toString();
    }
}
