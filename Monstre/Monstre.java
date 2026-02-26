package Monstre;

public abstract class Monstre {
    protected String nom;
    protected String type;
    protected int pv;
    protected int pvMax;
    protected int attaqueBase;
    protected int defense; 
    protected int niveau;
    protected int xpDonnee;

    public Monstre(String nom, String type, int pv, int attaqueBase, int defense, int niveau, int xpDonnee) {
        this.nom = nom;
        this.type = type;
        this.pvMax = pv;
        this.pv = pv;
        this.attaqueBase = attaqueBase;
        this.defense = defense;
        this.niveau = niveau;
        this.xpDonnee = xpDonnee;
    }

    public int attaquer() {
        int degats = this.attaqueBase + (this.niveau * 2);
        System.out.println(this.nom + " frappe  " + degats + " dégâts !");
        return degats;
    }

    public void recevoirDegats(int montant) {
   
        int degatsReels = montant - this.defense;
        if (degatsReels < 1) degatsReels = 1; 
        
        this.pv -= degatsReels;
        if (this.pv < 0) this.pv = 0;
        System.out.println(this.nom + " (Def:" + defense + ") encaisse. PV: " + this.pv);
    }

    public boolean estVivant() {
        return this.pv > 0;
    }

    public String getNom() { return nom; }
    public int getXpDonnee() { return xpDonnee; }
}