package com.company.car;

import org.fusesource.jansi.Ansi;

public class FastCar extends Car {

    public FastCar(Ansi.Color color) {
        super(color);
        System.out.println("Vous avez choisi la voiture rapide de couleur " + color);
    }
}
