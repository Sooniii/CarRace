package com.company;
import com.company.car.Car;

public class Game {

    private Car car;
    private boolean isFinish = false;

    public Game(Car car) {
        this.car = car;
        startGame();
    }

    public void startGame(){
        while (!isFinish){
            System.out.println("Salut");
            try{
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
