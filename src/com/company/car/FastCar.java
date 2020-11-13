package com.company.car;
import org.fusesource.jansi.Ansi;

import java.util.Random;


public class FastCar extends Car {

    Event event;

    /**
     * Constructeur de la voiture rapide
     * @param color Couleur de la voiture (du texte ici)
     */
    public FastCar(Ansi.Color color) {
        super(color);
        this.speed = 100;
        this.eventProba = 35;
        System.out.println("Vous avez choisi la voiture rapide de couleur " + color);
    }

    /**
     * Effectue les evenements pouvant survenir pendant la course
     */
    @Override
    public void event() {
        super.event();
        Random r = new Random();
        int eventNumber = r.nextInt(101);
        if (eventNumber <= eventProba){
            int typeEvent = r.nextInt(2);
            if (typeEvent == 0){
                event = new Motor();
            } else {
                event = new Wheel();
            }
            event.event();
        }
    }
}
