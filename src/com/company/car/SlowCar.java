package com.company.car;
import org.fusesource.jansi.Ansi;
import java.util.Random;
import java.util.Scanner;

public class SlowCar extends Car {

    public SlowCar(Ansi.Color color) {
        super(color);
        this.speed = 50;
        System.out.println("Vous avez choisi la voiture lente de couleur " + color);
    }

    @Override
    public void event1() {
        super.event1();
        String message = "VITESSE";
        String scrumble = "";
        Random r = new Random();
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
            this.eventTest = true;
        }
    }
}


