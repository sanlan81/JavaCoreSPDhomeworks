package com.spduniversity.javacore.hw3.homecinema;


public class CinimaTest {
    public static void main(String[] args) {
        /*Amplifier amplifier = new Amplifier();
        amplifier.setSorroundSound();
        amplifier.dvdPlayer = new DVDPlayer();
        amplifier.dvdPlayer.pause();
        amplifier.cdPlayer = new CDPlayer();
        amplifier.cdPlayer.on();
        amplifier.tuner = new Tuner();
        amplifier.tuner.off();

        Projector projector = new Projector();
        projector.wideScreenMode();
        TheaterLight theaterLight = new TheaterLight();
        theaterLight.dim();
        Screen screen = new Screen();
        screen.up();
        PopcornPopper popcornPopper = new PopcornPopper();
        popcornPopper.on();

        projector.dvdPlayer = new DVDPlayer();
        projector.dvdPlayer.pause();*/


        HCRemote hcRemote = new HCRemote();
        hcRemote.dvdPlayer = new DVDPlayer();
        hcRemote.popcornPopper = new PopcornPopper();
        hcRemote.theaterLight = new TheaterLight();
        hcRemote.screen = new Screen();
        hcRemote.amplifier = new Amplifier();
        hcRemote.cdPlayer = new CDPlayer();
        hcRemote.tuner = new Tuner();
        hcRemote.projector = new Projector();
        System.out.println();

        // Нажимаем кнопку на пульте awesomeRest
        hcRemote.awesomeRest();

        System.out.println();
        // Нажимаем кнопку на пульте endMovie
        hcRemote.endMovie();



    }
}
