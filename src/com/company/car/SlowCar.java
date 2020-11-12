package com.company.car;

import org.fusesource.jansi.Ansi;

import static org.fusesource.jansi.Ansi.ansi;

public class SlowCar extends Car {

    public SlowCar(Ansi.Color color) {
        super(color);
        this.speed = 50;
        System.out.println("Vous avez choisi la voiture lente de couleur " + color);
    }
}
