package com.company.MusicalInstrument;

/**
 * Created by liza on 25/11/2016.
 */
public class MusicalInstrument {
    String name;
    String brand;
    double price;

    public MusicalInstrument(String name, String brand, double price) {
        this.name = name;
        this.brand = brand;
        this.price = price;
    }

    public String getName(){
        return this.name;
    }

    public double getPrice() {
        return price;
    }
}
