package com.spduniversity.javacore.hw5.Laptop;


class OfficeLaptop extends Laptop {
    OfficeLaptop() {
        dvdDrive = " DVD Drive   Yes";
        motherboard = "Gigabyte GA-Z170X-Gaming 5";
        type = "OfficeLaptop";
    }

    @Override
    void canWorksWithoutCharging() {
        System.out.println(" Can works 6 hours !");
    }
}
