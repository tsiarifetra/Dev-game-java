package Game.Personnage;

public class Personnage {
    String name;
    int vie;
    int xp;
    int level;
    int atk;

    public Personnage(final String nom){
        this.name=nom;
        this.vie=50;
        this.xp=0;
        this.level=1;
        this.atk=5;
    }
    public Personnage(final String nom,int V,int X,int level){
        this.name=nom;
        this.vie=V;
        this.xp=X;
        this.level=level;
    }

    public String getName(){
        return name;
    }
    public int getVie(){
        return vie;
    }
    public int getXp(){
        return xp;
    }
    public int getAtk(){
        return atk;
    }
    public int getLevel(){
        return level;
    }

    /////////////
    public void setName(String nom){
        name=nom;
    }
    public void setVie(int V){
        vie=V;
    }
    public void setXp(int X){
        xp=X;
    }
    public void setAtk(int A){
        atk=A;
    }
    public void setLevel(int L){
        level=L;
    }

    public void Attaque(Personnage enemie){
        System.out.println(name+"attaque"+enemie.name);
        enemie.vie-=this.atk;
    }

    public void AffichageStatistique(){
        System.out.println("Nom : "+name);
        System.out.println("Poit de vie : "+vie);
        System.out.println("Level : "+level);
        System.out.println("Experiance : "+ xp);
        System.out.println("point d'attaque : "+atk);
    }
}
