package com.spduniversity.javacore.hw5.Laptop;


abstract class Laptop implements Cloneable {

    private String memory;
    String dvdDrive;
    String motherboard;
    protected String type;
    private String id;

    abstract void canWorksWithoutCharging();

    String getDvdDrive() {
        return dvdDrive;
    }

    String getMotherboard() {
        return motherboard;
    }


    String getMemory() {
        return memory;
    }

    void setMemory(String memory) {
        this.memory = memory;
    }

    String getType() {
        return type;
    }

    String getId() {
        return id;
    }

    void setId(String id) {
        this.id = id;
    }


    public Object clone() {
        Object clone = null;

        try {
            clone = super.clone();

        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        return clone;
    }

}
