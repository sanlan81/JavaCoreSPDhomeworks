package com.spduniversity.javacore.hw5.Laptop;


import java.util.Hashtable;

class LaptopCache {

    private static Hashtable<String, Laptop> shapeMap = new Hashtable<String, Laptop>();

    static Laptop getLaptop(String laptopId) {
        Laptop cachedLaptop = shapeMap.get(laptopId);
        return (Laptop) cachedLaptop.clone();
    }

    static void loadCache() {
        PlayLaptop playLaptop = new PlayLaptop();
        playLaptop.setId("1");
        playLaptop.setMemory("Memory 3 slots");
        shapeMap.put(playLaptop.getId(), playLaptop);

        OfficeLaptop officeLaptop = new OfficeLaptop();
        officeLaptop.setId("2");
        officeLaptop.setMemory("Memory 2 slots");
        shapeMap.put(officeLaptop.getId(), officeLaptop);


        TravelLaptop travelLaptop = new TravelLaptop();
        travelLaptop.setId("3");
        travelLaptop.setMemory("Memory 1 slots");
        shapeMap.put(travelLaptop.getId(), travelLaptop);

    }

}
