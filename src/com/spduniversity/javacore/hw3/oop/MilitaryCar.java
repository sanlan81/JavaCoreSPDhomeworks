package com.spduniversity.javacore.hw3.oop;

class MilitaryCar extends Car {


    int currentSubmergeDepth;
    boolean isGunOnBoard = true;


    //����㦠���� 㬥�� ������ �� ��।������� ��㡨��
    void submerge(){
        currentSubmergeDepth = 50;
    }

    //void surface(){
    //}

    void makeSound() {
        System.out.println("����� ᨣ����� �� �� ����� � ���㦠���!");
    }

}
