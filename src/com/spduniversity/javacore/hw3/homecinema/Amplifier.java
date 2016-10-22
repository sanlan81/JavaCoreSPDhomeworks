package com.spduniversity.javacore.hw3.homecinema;

public class Amplifier {

    Tuner tuner;
    DVDPlayer dvdPlayer;
    CDPlayer cdPlayer;

    void on(){
        System.out.println("Включить усилитель ");
    }

    void off(){
        System.out.println("Выключить усилитель ");
    }

    void  setCD(){
    }

    void  setDVD() {
        System.out.println("Связать вход усилителя со входом DVD");
    }

    void setStereoSound(){
    }

    void setSorroundSound(){
        System.out.println("Включить на усиление Dolby sorround!");

    }
   void setTuner(){

    }
   void setVolume(){
       System.out.println("Установить громкость 5");
    }

    @Override
    public String toString() {
        return "Amplifier{}";
    }
}
