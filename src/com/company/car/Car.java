package com.company.car;
import org.fusesource.jansi.Ansi;

import static org.fusesource.jansi.Ansi.ansi;

public class Car {

    Ansi.Color color;
    public float speed;
    protected int eventProba;
    protected boolean eventTest;

    /**
     * Constructeur de Car
     * @param color Couleur de la voiture (du texte ici)
     */
    public Car(Ansi.Color color) {
        this.color = color;
    }

    /**
     * Prends la couleur de la voiture pour l'utiliser sur le texte dans la console
     * Inquide la vitesse de la voiture
     */
    public void write(){
        System.out.print(ansi().fg(color).a(Ansi.Attribute.INTENSITY_BOLD));
        System.out.println("Ma vitesse est de : " + speed + "km/h");
    }

    /**
     * Effectue les evenements pouvant survenir durant la course
     */
    public void event(){
    }
}
