package com.company.car;
import org.fusesource.jansi.Ansi;
import java.util.Random;
import java.util.Scanner;

public class SlowCar extends Car {

    private int cycleBoost;

    /**
     * Constructeur de la voiture rapide
     * @param color Couleur de la voiture (du texte ici)
     */
    public SlowCar(Ansi.Color color) {
        super(color);
        this.speed = 50;
        this.eventProba = 25;
        System.out.println("Vous avez choisi la voiture lente de couleur " + color);
    }

    /**
     * Effectue les evenements pouvant survenir pendant la course
     */
    @Override
    public void event() {
        super.event();
        Random r = new Random();
        int eventNumber = r.nextInt(101);
        if (this.eventTest){
            cycleBoost += 1;
            System.out.println("Le boost est actif pendant encore " + (5 - cycleBoost) + " tours !");
        }
        if (eventNumber <= eventProba && !this.eventTest){
            String message = "VITESSE";
            String scrumble = "";
            StringBuilder sb = new StringBuilder(message);
            for (int i = 0; i < message.length(); i++) {
                int index = r.nextInt(sb.length());
                scrumble += sb.charAt(index);
                sb.deleteCharAt(index);
                }
            System.out.println(scrumble);
            System.out.println("Retape le mot affiché pour obtenir un boost de 300% de vitesse");
            Scanner sc = new Scanner(System.in);
            String userText = sc.nextLine();
            if (!(userText.equals(scrumble))){
                System.out.println("Tu as mal écrit le mot dommage pour toi !");
                this.eventTest = false;
            } else {
                System.out.println("Bravo tu as gagné un boost de 300% pendant 4 tours");
                this.speed *= 4;
                this.eventTest = true;
            }
        }
        if (cycleBoost > 4){
            cycleBoost = 0;
            this.speed = 50;
            this.eventTest = false;
        }
    }
}


