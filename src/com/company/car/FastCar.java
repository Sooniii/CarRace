package com.company.car;
import org.fusesource.jansi.Ansi;

import java.util.Random;


public class FastCar extends Car {

    Event[] event;

    /**
     * Constructeur de la voiture rapide
     * @param color Couleur de la voiture (du texte ici)
     */
    public FastCar(Ansi.Color color) {
        super(color);
        this.speed = 100;
        this.eventProba = 35;
        event = new Event[2];
        event[0] = new Motor();
        event[1] = new Wheel();
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
            event[r.nextInt(event.length)].event(); 
        }
    }
}
