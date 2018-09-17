package com.company;

public class Rodeur extends Personnage {

    public Rodeur(String nom, int niveau, int force, int agilite, int intelligence) throws FauteDeSaisie {
        super(nom, niveau, force, agilite, intelligence);
    }

    @Override
    public void attaqueBasique(Personnage cible) {
        int dommage = agilite;
        System.out.println(nom +  " utilise Tir à l’Arc et inflige " + dommage + " dommages.");
        cible.infligeDommages(dommage);
    }

    @Override
    public void attaqueSpecial(Personnage cible) {
        int agilitePlus = niveau/ 2;
        System.out.println(nom +  " utilise Concentration et gagne " + agilitePlus + " en agilité.");
        agilite += agilitePlus;
    }

    @Override
    public String toString() {
        return "Chut je suis le Rôdeur " + nom +
                " niveau " + niveau +
                " je possède " + vitalite + " de vitalité, " +
                force + " de force, " +
                agilite + " d'agilité et " +
                intelligence + " d'intelligence !";
    }
}

