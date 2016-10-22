package com.spduniversity.javacore.hw3.homecinema;


public class HCRemote {
    Amplifier amplifier;
    Tuner tuner;
    DVDPlayer dvdPlayer;
    CDPlayer cdPlayer;
    PopcornPopper popcornPopper;
    Projector projector;
    Screen screen;
    TheaterLight theaterLight;

    void awesomeRest(){
        popcornPopper.on();
        popcornPopper.pop();
        theaterLight.off();
        screen.down();
        projector.on();
        projector.tvMode();
        projector.wideScreenMode();
        amplifier.on();
        amplifier.setDVD();
        amplifier.setSorroundSound();
        amplifier.setVolume();
        dvdPlayer.on();
        dvdPlayer.play();
    }

   void endMovie(){
       popcornPopper.off();
       theaterLight.on();
       screen.up();
       projector.off();
       amplifier.off();
       dvdPlayer.stop();
       dvdPlayer.eject();
       dvdPlayer.off();
   }
}
