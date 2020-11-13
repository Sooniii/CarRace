package com.company;
import com.company.car.Car;


public class Game {

    private Car car;
    private boolean isFinish = false;
    private int nbLaps = 5;
    private int currentLap = 0;
    private float distanceLap = 10000;
    private float traveledDistance;
    private int nbCycle;

    /**
     * Constructeur du jeu
     * @param car Prends la voiture crée par le joueur
     */
    public Game(Car car) {
        this.car = car;
        startGame();
    }

    /**
     * Gere la boucle de jeu (la lance, l'actualise toutes les secondes et arrete le jeu quand il est finit)
     */
    public void startGame(){
        while (!isFinish){
            Console.clear();
            car.write();
            update();
            car.event();
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

    /**
     * Affiche là où le joueur en est dans la course ainsi que la distance restante
     * Pareil pour le nombre de tour
     */
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
        else if (currentLap == nbLaps) {
            System.out.println("La distance parcourue est de " + traveledDistance +
                    "m , il reste " + (distanceLap - traveledDistance) + "m avant la fin de la course");
                System.out.println("Dernier tour ! Nombre de cycle : " + nbCycle);
            }
            else {
                System.out.println("La distance parcourue est de " + traveledDistance +
                        "m , il reste " + (distanceLap - traveledDistance) + "m avant la fin du tour");
                System.out.println("Tour actuel : " + currentLap + "/" + nbLaps + " Nombre de cycle : " + nbCycle);
            }
            nbCycle += 1;
    }
}
