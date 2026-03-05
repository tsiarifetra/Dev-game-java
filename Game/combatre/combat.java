package Game.combatre;

import java.util.Scanner;

import Game.Personnage.Personnage;

public class combat {
     Scanner sc = new Scanner(System.in);

    public void combattre(Personnage p1, Personnage p2) {

        while (p1.getVie() > 0 && p2.getVie() > 0) {

            System.out.println("\nTour de " + p1.getName());

            System.out.println("1 - Attaquer");
            System.out.println("2 - Potion");

            int choix = sc.nextInt();

            if (choix == 1) {
                p1.attaque(p2);
            } else {
                p1.potion();
            }

            if (p2.getVie() <= 0)
                break;

            System.out.println("\nTour de " + p2.getName());

            p2.attaque(p1);

            p1.afficher();
            p2.afficher();
        }

        System.out.println("Combat terminé !");
    }
}
