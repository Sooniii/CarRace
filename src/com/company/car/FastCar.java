package com.company.car;
import org.fusesource.jansi.Ansi;

import java.util.Random;
import java.util.Scanner;


public class FastCar extends Car {

    public FastCar(Ansi.Color color) {
        super(color);
        this.speed = 100;
        System.out.println("Vous avez choisi la voiture rapide de couleur " + color);
    }

    @Override
    public void event1() {
        super.event1();
        int maxTab = 5;
        String nbList = "";
        Random r = new Random();
        for (int i = 0; i < maxTab; i++) {
            nbList += r.nextInt(10);
        }
        System.out.println("Recopie cette suite de chiffre sans faute pour réparer ton moteur !");
        System.out.println(nbList);
        Scanner sc = new Scanner(System.in);
        String userText = sc.nextLine();
        while (!(userText.equals(nbList))){
            System.out.println("Concentre toi ! Tu vas perdre la course !");
            userText = sc.nextLine();
        }
        System.out.println("Ton moteur est réparé, la course reprends !");
    }

    @Override
    public void event2() {
        super.event2();
    }
}
