package com.company.car;

import java.util.Random;
import java.util.Scanner;

public class Motor extends Event{

    /**
     * Effectue les evenements pouvant survenir pendant la course
     */
    @Override
    public void event() {
        super.event();
        Random r = new Random();
        int maxTab = 5;
        String nbList = "";
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
}
