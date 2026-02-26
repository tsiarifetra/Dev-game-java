package Monstre;

public class Boss1 extends Monstre {
    public Boss1() {
        super("Grand Danz", "Ultra-Cyber", 150, 15, 10, 3, 500);
    }

    @Override
    public int attaquer() {
        System.out.println("LE BOSS envoie LAZER");
        return super.attaquer() + 5; 
    }
}