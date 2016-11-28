package com.company.MusicalInstrument;

/**
 * Created by liza on 25/11/2016.
 */
public class Guitar extends MusicalInstrument {
    boolean electronik;
    public Guitar(String name, String brand, double price, boolean electronik) {
        super(name, brand, price);
        this.electronik= electronik;
    }
}
