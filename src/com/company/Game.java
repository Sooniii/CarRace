package com.company;
import com.company.car.Car;

public class Game {

    private Car car;
    private boolean isFinish = false;
    private int nbLaps = 5;
    private int currentLap = 0;
    private float distanceLap = 10000;
    private float travelDistance;
    private int nbCycle;

    public Game(Car car) {
        this.car = car;
        startGame();
    }

    public void startGame(){
        while (!isFinish){
            Console.clear();
            car.write();
            update();
            try{
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        Console.clear();
        System.out.println("Merci d'avoir joué ! :D");
    }

    public void update(){
        travelDistance += car.speed * 1000 / 60;
        if (travelDistance >= distanceLap){
            float superiorTravelDistance = travelDistance - distanceLap;
            travelDistance = 0 + superiorTravelDistance;
            currentLap += 1;
        }
        if (currentLap > nbLaps) {
            isFinish = true;
        }
        else {
            System.out.println("La distance parcourue est de " + travelDistance +
                    "m , il reste " + (distanceLap - travelDistance) + "m avant la fin du tour");
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
