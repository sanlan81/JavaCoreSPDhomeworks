package com.spduniversity.javacore.hw3.oop;

import java.util.ArrayList;

class TestCar {

    public static void main(String[] args) {
        TestCar testCar = new TestCar();
        testCar.go();
    }


    private void go() {

        HighspeedCar highspeedCar = new HighspeedCar();
        MilitaryCar militaryCar = new MilitaryCar();

        ArrayList<Car> arrayList = new ArrayList<>();
        // TODO Auto-generated method stub

        highspeedCar.setColor("Green");
        militaryCar.setColor("Black");

        highspeedCar.setNumberOfDoors(5);
        militaryCar.setNumberOfDoors(2);

        highspeedCar.setBrand("BMW");
        militaryCar.setBrand("GTUO-Tank");


        militaryCar.submerge();
        militaryCar.startEnergy();
        arrayList.add(highspeedCar);
        arrayList.add(militaryCar);

        //Используем Общий тип Car для всех машин
        for (Car carr : arrayList) {

            System.out.println("Это машина " + carr.getBrand()+  " цвет "+ carr.getColor() + "  Имеет "+
                    carr.getNumberOfDoors()+ " дверей.  " );
            carr.play();


        }

        System.out.println("===============================");
        System.out.println(" Нет моя машина самая лучшая  ее скорость " + highspeedCar.speedDistannce(5)+ "км/ч");
        System.out.println("Она со встроенным оружием и это "+ militaryCar.isGunOnBoard);
        System.out.println("Она умеет погружаться на глубину " + militaryCar.currentSubmergeDepth +" метров");
        System.out.println("И конечно же  аббалденная стратовая  скорость " +  militaryCar.startEnergy + "км ч");
         //pc.makeSound();


    }
}

