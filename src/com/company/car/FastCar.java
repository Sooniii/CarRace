package com.company.car;

import org.fusesource.jansi.Ansi;

import static org.fusesource.jansi.Ansi.ansi;

public class FastCar extends Car {

    public FastCar(Ansi.Color color) {
        super(color);
        this.speed = 100;
        System.out.println("Vous avez choisi la voiture rapide de couleur " + color);
    }
}
