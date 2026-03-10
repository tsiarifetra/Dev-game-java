package Game.Personnage;

public class Personnage {

    protected String name;
    protected int vie;
    protected int xp;
    protected int level;
    protected int atk;

    public Personnage(String name) {
        this.name = name;
        this.vie = 50;
        this.xp = 0;
        this.level = 1;
        this.atk = 5;
    }

    public String getName() {
        return name;
    }

    public int getVie() {
        return vie;
    }

    public int getLevel() {
        return level;
    }

    public int getXp() {
        return xp;
    }

    public void attaque(Personnage ennemi) {
        if(this.vie<=0){
            System.out.println(this.name + " est mort dont il ne peut pas attaque");
            return;
        }
        if(ennemi.vie<=0){
            System.out.println("l'ennemie est déjà mort");
            return;
        }

        ennemi.vie -= atk;

        System.out.println(name + " attaque " + ennemi.name);
        System.out.println("Degats : " + atk);

        if (ennemi.vie <= 0) {
            ennemi.vie = 0;
            System.out.println(ennemi.name + " est mort !");
            gagnerXp(5);
        }
    }

    public void potion() {

        vie += 10;

        if (vie > 50)
            vie = 50;

        System.out.println(name + " utilise une potion (+10 vie)");
    }

    public void gagnerXp(int x) {

        xp += x;

        if (xp >= 20) {
            level++;
            xp = 0;
            atk += 2;

            System.out.println(name + " monte au niveau " + level);
        }
    }

    public void afficher() {

        System.out.println("Nom : " + name);
        System.out.println("Vie : " + vie);
        System.out.println("Level : " + level);
        System.out.println("XP : " + xp);
        System.out.println("ATK : " + atk);
        System.out.println("-------------------");
    }
}
