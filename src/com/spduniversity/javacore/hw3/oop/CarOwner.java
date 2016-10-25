package com.spduniversity.javacore.hw3.oop;

import java.util.ArrayList;

class TestCar {

    public static void main(String[] args) {
        TestCar testCar = new TestCar();
        testCar.go();
    }


    private void go() {

        LanskyyCar lc = new LanskyyCar();
        PitersCar pc = new PitersCar();

        ArrayList<Car> arrayList = new ArrayList<>();
        // TODO Auto-generated method stub

        lc.setColor("Green");
        pc.setColor("Black");

        lc.setNumberOfDoors(5);
        pc.setNumberOfDoors(2);

        lc.setBrand("BMW");
        pc.setBrand("GTUO-Tank");


        pc.submerge();
        pc.startEnergy();
        arrayList.add(lc);
        arrayList.add(pc);

        //Используем Общий тип Car для всех машин
        for (Car carr : arrayList) {

            System.out.println("Это машина " + carr.getBrand()+  " цвет "+ carr.getColor() + "  Имеет "+
                    carr.getNumberOfDoors()+ " дверей.  " );
            carr.play();


        }

        System.out.println("===============================");
        System.out.println(" Нет моя машина самая лучшая  ее скорость " + lc.speedDistannce(5)+ "км/ч");
        System.out.println("Она со встроенным оружием и это "+ pc.isGunOnBoard);
        System.out.println("Она умеет погружаться на глубину " + pc.currentSubmergeDepth +" метров");
        System.out.println("И конечно же  аббалденная стратовая  скорость " +  pc.startEnergy + "км ч");
         //pc.makeSound();


    }
}

