package com.spduniversity.javacore.hw9.TreeSetDemoComparatorAnonymousClass;

class Car implements Comparable {
    private String name;
    private int price;
    private String brand;
    private int year;

    Car(String name, int price, String brand, int year) {
        this.name = name;
        this.price = price;
        this.brand = brand;
        this.year = year;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    String getBrand() {
        return brand;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", brand='" + brand + '\'' +
                ", brand='" + year + '\'' +
                '}';
    }

    @Override
    public int compareTo(Object car) {
        return getName().compareTo(((Car) car).getName());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Car car = (Car) o;

        return price == car.price && year == car.year && (name != null ?
                name.equals(car.name) : car.name == null && (brand != null ?
                brand.equals(car.brand) : car.brand == null));
    }

    @Override    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + price;
        result = 31 * result + (brand != null ? brand.hashCode() : 0);
        result = 31 * result + year;
        return result;
    }

    int getYear() {
        return year;
    }
}

/*
class NameComparator implements Comparator {

    @Override
    public int compare(Object o1, Object o2) {
        return ((Car)o1).getName().compareTo(((Car)o2).getName());
    }

    @Override
    public Comparator reversed() {
        return (o1, o2) -> ((Car)o2).getName().compareTo(((Car)o1).getName());
    }
}
*/


