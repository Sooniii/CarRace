package com.company.car;

import java.util.Random;
import java.util.Scanner;

public class Wheel extends Event{

    Scanner sc = new Scanner(System.in);

    /**
     * Effectue les evenements pouvant survenir pendant la course
     */
    @Override
    public void event() {
        super.event();
        Random r = new Random();
        int wheelBug = r.nextInt(4);
        if (wheelBug == 0) {
            leftUpWheel();
        } else if (wheelBug == 1){
            rightUpWheel();
        } else if (wheelBug == 2){
            leftDownWheel();
        } else {
            rightDownWheel();
        }
        System.out.println("La roue a été changé, la course reprends !");
    }

    /**
     * Evenement pour reparer la roue avant gauche
     */
    private void leftUpWheel(){
        System.out.println("La roue avant gauche a crevé !");
        System.out.println("Appuie sur L pour sortir de la voiture");
        String userWord = sc.next();
        while (!userWord.equals("L")){
            userWord = sc.next();
            if (!userWord.equals("L")){
                System.out.println("Ce n'est pas la bonne action");
            }
        }
        System.out.println("Appuie sur U pour aller vers l'avant");
        while (!userWord.equals("U")){
            userWord = sc.next();
            if (!userWord.equals("U")){
                System.out.println("Ce n'est pas la bonne action");
            }
        }
        System.out.println("Appuie sur C pour changer la roue");
        while (!userWord.equals("C")){
            userWord = sc.next();
            if (!userWord.equals("C")){
                System.out.println("Ce n'est pas la bonne action");
            }
        }
        System.out.println("Appuie sur D pour revenir a la porte");
        while (!userWord.equals("D")){
            userWord = sc.next();
            if (!userWord.equals("D")){
                System.out.println("Ce n'est pas la bonne action");
            }
        }
        System.out.println("Appuie sur R pour retourner dans la voiture et reprendre la course !");
        while (!userWord.equals("R")){
            userWord = sc.next();
            if (!userWord.equals("R")){
                System.out.println("Ce n'est pas la bonne action");
            }
        }
    }

    /**
     * Evenement pour reparer la roue avant droite
     */
    private void rightUpWheel(){
        System.out.println("La roue avant droite a crevé !");
        System.out.println("Appuie sur L pour sortir de la voiture");
        String userWord = sc.next();
        while (!userWord.equals("L")){
            userWord = sc.next();
            if (!userWord.equals("L")){
                System.out.println("Ce n'est pas la bonne action");
            }
        }
        System.out.println("Appuie sur U pour aller vers l'avant");
        while (!userWord.equals("U")){
            userWord = sc.next();
            if (!userWord.equals("U")){
                System.out.println("Ce n'est pas la bonne action");
            }
        }
        System.out.println("Appuie sur R pour aller vers la droite");
        while (!userWord.equals("R")){
            userWord = sc.next();
            if (!userWord.equals("R")){
                System.out.println("Ce n'est pas la bonne action");
            }
        }
        System.out.println("Appuie sur C pour changer la roue");
        while (!userWord.equals("C")){
            userWord = sc.next();
            if (!userWord.equals("C")){
                System.out.println("Ce n'est pas la bonne action");
            }
        }
        System.out.println("Appuie sur L pour aller vers la gauche");
        while (!userWord.equals("L")){
            userWord = sc.next();
            if (!userWord.equals("L")){
                System.out.println("Ce n'est pas la bonne action");
            }
        }
        System.out.println("Appuie sur D pour revenir a la porte");
        while (!userWord.equals("D")){
            userWord = sc.next();
            if (!userWord.equals("D")){
                System.out.println("Ce n'est pas la bonne action");
            }
        }
        System.out.println("Appuie sur R pour retourner dans la voiture et reprendre la course !");
        while (!userWord.equals("R")){
            userWord = sc.next();
            if (!userWord.equals("R")){
                System.out.println("Ce n'est pas la bonne action");
            }
        }
    }

    /**
     * Evenement pour reparer la roue arrière gauche
     */
    private void leftDownWheel(){
        System.out.println("La roue arrière gauche a crevé !");
        System.out.println("Appuie sur L pour sortir de la voiture");
        String userWord = sc.next();
        while (!userWord.equals("L")){
            userWord = sc.next();
            if (!userWord.equals("L")){
                System.out.println("Ce n'est pas la bonne action");
            }
        }
        System.out.println("Appuie sur D pour aller vers l'arrière");
        while (!userWord.equals("D")){
            userWord = sc.next();
            if (!userWord.equals("D")){
                System.out.println("Ce n'est pas la bonne action");
            }
        }
        System.out.println("Appuie sur C pour changer la roue");
        while (!userWord.equals("C")){
            userWord = sc.next();
            if (!userWord.equals("C")){
                System.out.println("Ce n'est pas la bonne action");
            }
        }
        System.out.println("Appuie sur U pour revenir a la porte");
        while (!userWord.equals("U")){
            userWord = sc.next();
            if (!userWord.equals("U")){
                System.out.println("Ce n'est pas la bonne action");
            }
        }
        System.out.println("Appuie sur R pour retourner dans la voiture et reprendre la course !");
        while (!userWord.equals("R")){
            userWord = sc.next();
            if (!userWord.equals("R")){
                System.out.println("Ce n'est pas la bonne action");
            }
        }
    }

    /**
     * Evenement pour reparer la roue arrière droite
     */
    private void rightDownWheel(){
        System.out.println("La roue arrière droite a crevé !");
        System.out.println("Appuie sur L pour sortir de la voiture");
        String userWord = sc.next();
        while (!userWord.equals("L")){
            userWord = sc.next();
            if (!userWord.equals("L")){
                System.out.println("Ce n'est pas la bonne action");
            }
        }
        System.out.println("Appuie sur D pour aller vers l'arrière");
        while (!userWord.equals("D")){
            userWord = sc.next();
            if (!userWord.equals("D")){
                System.out.println("Ce n'est pas la bonne action");
            }
        }
        System.out.println("Appuie sur R pour aller vers la droite");
        while (!userWord.equals("R")){
            userWord = sc.next();
            if (!userWord.equals("R")){
                System.out.println("Ce n'est pas la bonne action");
            }
        }
        System.out.println("Appuie sur C pour changer la roue");
        while (!userWord.equals("C")){
            userWord = sc.next();
            if (!userWord.equals("C")){
                System.out.println("Ce n'est pas la bonne action");
            }
        }
        System.out.println("Appuie sur L pour aller vers la gauche");
        while (!userWord.equals("L")){
            userWord = sc.next();
            if (!userWord.equals("L")){
                System.out.println("Ce n'est pas la bonne action");
            }
        }
        System.out.println("Appuie sur U pour revenir a la porte");
        while (!userWord.equals("U")){
            userWord = sc.next();
            if (!userWord.equals("U")){
                System.out.println("Ce n'est pas la bonne action");
            }
        }
        System.out.println("Appuie sur R pour retourner dans la voiture et reprendre la course !");
        while (!userWord.equals("R")){
            userWord = sc.next();
            if (!userWord.equals("R")){
                System.out.println("Ce n'est pas la bonne action");
            }
        }
    }
}
