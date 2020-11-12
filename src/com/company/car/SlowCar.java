package com.company.car;

import org.fusesource.jansi.Ansi;

public class SlowCar extends Car {

    public SlowCar(Ansi.Color color) {
        super(color);
        System.out.println("Vous avez choisi la voiture lente de couleur " + color);
    }
}
