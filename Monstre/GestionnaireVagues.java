package Monstre;

import java.util.LinkedList;
import java.util.Queue;

public class GestionnaireVagues {
    private Queue<Monstre> fileAttente;

    public GestionnaireVagues() {
        fileAttente = new LinkedList<>();
        
        fileAttente.add(new Monstre1());
        fileAttente.add(new Monstre1()); 
        fileAttente.add(new Monstre1()); 
        fileAttente.add(new Monstre1()); 
        
        fileAttente.add(new Monstre1());
        fileAttente.add(new Monstre1()); 
        fileAttente.add(new Monstre1()); 
        
     
        fileAttente.add(new Boss1());
    }

    public Monstre suivant() {
        return fileAttente.poll(); // Donne le monstre et le retire de la liste
    }

    public boolean estVide() {
        return fileAttente.isEmpty();
    }
}
}
