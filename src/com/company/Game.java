package com.company;
import com.company.car.Car;
import com.company.car.FastCar;
import com.company.car.SlowCar;

import java.util.Random;

public class Game {

    private Car car;
    private boolean isFinish = false;
    private int nbLaps = 5;
    private int currentLap = 0;
    private float distanceLap = 10000;
    private float traveledDistance;
    private int nbCycle;
    private int eventNumber;
    private boolean boostTime = false;
    private int cycleBoost;

    public Game(Car car) {
        this.car = car;
        startGame();
    }


    public void startGame(){
        while (!isFinish){
            Console.clear();
            car.write();
            Random r = new Random();
            eventNumber = r.nextInt(101);
            if (car instanceof FastCar){
                if (eventNumber < 35) {
                        int randomEvent = r.nextInt(2);
                        if (randomEvent == 0) {
                            car.event1();
                        } else {
                            car.event2();
                        }
                }
            } else if (eventNumber < 25 && boostTime == false) {
                    car.event1();
                    cycleBoost = 0;
                if (car.getEventTest()){
                        boostTime = true;
                        car.speed *= 4;
                    } else {
                        boostTime = false;
                }
            }
            update();
            if (boostTime && cycleBoost < 4) {
                cycleBoost += 1;
            } else if (car instanceof SlowCar){
                boostTime = false;
                car.speed = 50;
            }
            try{
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        Console.clear();
        System.out.println("Merci d'avoir joué ! :D");
        System.out.println("Tu as mis " + nbCycle + " secondes pour terminer la course");
    }

    public void update(){
        traveledDistance += car.speed * 1000 / 60;
        if (traveledDistance >= distanceLap){
            float superiorTravelDistance = traveledDistance - distanceLap;
            traveledDistance = 0 + superiorTravelDistance;
            currentLap += 1;
        }
        if (currentLap > nbLaps) {
            isFinish = true;
        }
        else {
            System.out.println("La distance parcourue est de " + traveledDistance +
                    "m , il reste " + (distanceLap - traveledDistance) + "m avant la fin du tour");
            if (boostTime) {
                System.out.println("Le boost est actif pendant encore " + (5 - cycleBoost) + " tour !");
            }
            if (currentLap == nbLaps) {
                System.out.println("Dernier tour ! Nombre de cycle : " + nbCycle);
            }
            else {
                System.out.println("Tour actuel : " + currentLap + "/" + nbLaps + " Nombre de cycle : " + nbCycle);
            }
            nbCycle += 1;
        }
    }
}
