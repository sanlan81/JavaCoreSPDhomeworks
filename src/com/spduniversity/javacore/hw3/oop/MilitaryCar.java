package com.spduniversity.javacore.hw3.oop;

class MilitaryCar extends Car implements Controlling{


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

    public void voiceConnection() {
        System.out.println("This car understand voice command \"Engine  on!!!\"");
    }
}
