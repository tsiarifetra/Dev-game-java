package Game.Personnage;

public class Mage extends Personnage{

    public Mage(String name) {
        super(name);

        this.vie = 40;
        this.atk = 10;
    }

    public void sortDuFeux(Personnage ennemi) {

        int degat = 15;

        ennemi.vie -= degat;

        System.out.println(name + " lance un sort du feux !");
        System.out.println("Degats : " + degat);

        if (ennemi.vie <= 0) {
            ennemi.vie = 0;
        }
    }
    public void sortDuEau(Personnage ennemi) {

        int degat = 10;

        ennemi.vie -= degat;

        System.out.println(name + " lance un sort de l'eau !");
        System.out.println("Degats : " + degat);

        if (ennemi.vie <= 0) {
            ennemi.vie = 0;
        }
    }
    public void sortDuTerre(Personnage ennemi) {

        int degat = 20;

        ennemi.vie -= degat;

        System.out.println(name + " lance un sort du terre !");
        System.out.println("Degats : " + degat);

        if (ennemi.vie <= 0) {
            ennemi.vie = 0;
        }
    }
}
