package com.spduniversity.javacore.hw3.oop;

class Car {
    private CDPlayer cdPlayer = new CDPlayer();
    private int numberOfDoors;
    private String color;
    private String name;
    protected int startEnergy = 0;




    void play() {
        cdPlayer.play();
    }


    int getNumberOfDoors() {
        return numberOfDoors;
    }

    void setNumberOfDoors(int numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
    }



     String getColor() {
        return color;
    }

     void setColor(String color) {
        this.color = color;
    }


     void setBrand(String name) {

        this.name = name;
    }

    String getBrand() {

        return name;
    }

    // Расчитываем скорость
    int speedDistannce(int speed) {
        return  speed * 60;
    }

    //Стартовая скорость
     void startEnergy() {
          startEnergy = 100;
    }


  /*  public void stopEnergy() {
    int tempCounter = 0;
    }
*/







}