import Game.Personnage.Personnage;
import Monstre.Boss1;
import java.util.Scanner;
import Monstre.Monstre;
public class main {
    public static void main(String[] args) {
        Scanner s =new Scanner(System.in);
        System.out.println("_____________Creation du personnage______________");

        System.out.print("Entre le votre nom : ");
        Personnage joueur=new Personnage(s.nextLine());

        joueur.AffichageStatistique();
        
        joueur.Attaque();

    }
    
}
