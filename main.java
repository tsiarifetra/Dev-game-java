import Game.Personnage.Personnage;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner s =new Scanner(System.in);
        System.out.println("_____________Creation du personnage______________");

        System.out.print("Entre le votre nom : ");
        String nom=s.nextLine();
        Personnage joueur=new Personnage(nom);
        joueur.afficher();


        System.out.print("Entre le votre nom : ");
        Personnage joueur1=new Personnage(s.nextLine());
        joueur1.afficher();

        System.out.println("__________________________");
        joueur.attaque(joueur1);
        joueur.attaque(joueur1);
        joueur.attaque(joueur1);
        joueur.afficher();
        System.out.println("__________________________");
        joueur1.afficher();
        joueur1.attaque(joueur);
        joueur1.potion();
        System.out.println("__________________________");
        joueur.afficher();

        
        //Monstre deba=new Monstre("Radange kely", "Cyber", 30, 5, 1, 1, 10);

        //deba.attaquer();
        
    }
    
}
