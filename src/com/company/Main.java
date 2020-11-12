package com.company;
import com.company.car.Car;

public class Main {


    public static void main(String[] args) {
        Car car = Menu.startMenu();
        Console.clear();
        Game game = new Game(car);
        game.startGame();
    }
}
