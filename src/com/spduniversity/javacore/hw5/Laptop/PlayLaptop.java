package com.spduniversity.javacore.hw5.Laptop;


class PlayLaptop extends Laptop {
    PlayLaptop() {
        dvdDrive = " DVD Drive   Yes";
        motherboard = "MSI Z170A XPower Gaming Titanium Edition";
        type = "PlayLaptop";

    }

    @Override
    void canWorksWithoutCharging() {
        System.out.println(" Can works 4 hours !");
    }

}
