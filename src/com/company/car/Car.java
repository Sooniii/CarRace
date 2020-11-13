package com.company.car;
import org.fusesource.jansi.Ansi;

import static org.fusesource.jansi.Ansi.ansi;

public class Car {

    Ansi.Color color;
    public float speed;
    public int eventProba;
    public boolean eventTest;


    public Car(Ansi.Color color) {
        this.color = color;
    }

    public void write(){
        System.out.print(ansi().fg(color).a(Ansi.Attribute.INTENSITY_BOLD));
        System.out.println("Ma vitesse est de : " + speed + "km/h");
    }

    public void event(){
    }
}
