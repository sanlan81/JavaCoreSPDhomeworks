package com.spduniversity.javacore.hw3.oop;

import java.util.ArrayList;

class CarOwner {

    public static void main(String[] args) {
        CarOwner carOwner = new CarOwner();
        carOwner.go();
    }


    private void go() {
        Car car = new Car();
        LanskyyCar lc = new LanskyyCar();
        PitersCar pc = new PitersCar();

        ArrayList<Car> arrayList = new ArrayList<>();
        // TODO Auto-generated method stub

        lc.setName("Lamvorgini");
        pc.setName("Ferrary");

        arrayList.add(lc);
        arrayList.add(pc);

        for (Car carr : arrayList) {
            System.out.println("У меня есть   машина: " + carr.getName());

            carr.makeSound();
        }

        //int carspeed = car.drive(50);
        //System.out.println(carspeed);

        System.out.println(" Меня звать Александр моя машина самая лучшая  " + lc.drive(10));

        car.play();

    }
}

