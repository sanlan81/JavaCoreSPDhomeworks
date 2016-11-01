package com.spduniversity.javacore.hw5.Laptop;

class TravelLaptop extends Laptop {
    TravelLaptop() {
        dvdDrive = " DVD Drive   Not";
        motherboard = "ASRock Fatal1ty Z170 Gaming K6";
        type = "TravelLaptop";
    }

    @Override
    void canWorksWithoutCharging() {
        System.out.println(" Can works 12 hours !");
    }
}
