package com.spduniversity.javacore.hw5.Laptop;

public class PrototypeDemo {
    public static void main(String[] args) {
        LaptopCache.loadCache();

        Laptop clonedLaptop = LaptopCache.getLaptop("1");
        System.out.println("Laptop : " + clonedLaptop.getId() + " " + clonedLaptop.getType() + "  " +
                " Motherboard model " + clonedLaptop.getMotherboard() + "\n" + "" +
                "" + clonedLaptop.getDvdDrive() + "\n" + "" +
                "" + clonedLaptop.getMemory());

        clonedLaptop.canWorksWithoutCharging();

        System.out.println("==================");
        Laptop clonedLaptop2 = LaptopCache.getLaptop("2");
        System.out.println("Laptop : " + clonedLaptop2.getId() + " " + clonedLaptop2.getType() + "  " +
                " Motherboard model " + clonedLaptop2.getMotherboard() + "\n" + "" +
                "" + clonedLaptop2.getDvdDrive() + "\n" + "" +
                "" + clonedLaptop2.getMemory());

        clonedLaptop2.canWorksWithoutCharging();

        System.out.println("==================");
        Laptop clonedLaptop3 = LaptopCache.getLaptop("3");
        System.out.println("Laptop : " + clonedLaptop3.getId() + " " + clonedLaptop3.getType() + "  " +
                " Motherboard model " + clonedLaptop3.getMotherboard() + "\n" + "" +
                "" + clonedLaptop3.getDvdDrive() + "\n" + "" +
                "" + clonedLaptop3.getMemory());

        clonedLaptop3.canWorksWithoutCharging();

    }
}
