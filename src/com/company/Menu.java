package com.company;

import org.fusesource.jansi.Ansi;
import org.fusesource.jansi.AnsiConsole;
import com.company.car.Car;
import com.company.car.FastCar;
import com.company.car.SlowCar;

import java.util.Scanner;

import static org.fusesource.jansi.Ansi.ansi;

public class Menu {

    public static Car startMenu(){
        AnsiConsole.systemInstall();
        int playerInput;
        Car car;
        System.out.println(" ");
        System.out.println("------------------------");
        System.out.println("Bienvenue dans la course");
        System.out.println("------------------------");
        System.out.println("\nChoisissez la voiture que vous voulez utiliser");
        System.out.println(" ");
        System.out.println("Tapez 1 pour jouer avec la voiture rapide, elle a un risque de dysfonctionnement de 35%");
        System.out.println("Tapez 2 pour jouer avec la voiture lente, elle a 25% de chance d'obtenir un boost");
        Scanner scan = new Scanner(System.in);
        do {
            var playerChoice = scan.nextLine();
            playerInput = Integer.parseInt(playerChoice);
            try {
                if (playerInput != 1 && playerInput != 2) {
                    System.out.println("Le choix ne peut pas être différent de 1 ou 2");
                }
            } catch (NumberFormatException e) {
                e.printStackTrace();
            }

        } while (playerInput != 1 && playerInput != 2);

        System.out.println("Choix de la couleur de la voiture");
        for (var item : Ansi.Color.values()) {
            System.out.print(ansi().fg(item).a(Ansi.Attribute.INTENSITY_BOLD));
            System.out.println(item);
        }
        System.out.println(ansi().reset().a("Tapez le nom de la couleur que vous voulez"));
        boolean goodColor = false;
        Ansi.Color color = null;
        do {
            var colorName = scan.nextLine();
            try {
                color = Ansi.Color.valueOf(colorName);
            } catch (IllegalArgumentException e) {
                System.out.println("Cette couleur n'existe pas");
                colorName = "";
            }
            if (color != null)
                goodColor = true;
        } while (!goodColor);

        if (playerInput == 1)
            car = new FastCar(color);
        else
            car = new SlowCar(color);

        System.out.println("La course peut commencer");
        return car;
    }
}
