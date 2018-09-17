package com.company;

public class Guerrier extends Personnage {

    public Guerrier(String nom, int niveau, int force, int agilite, int intelligence) throws FauteDeSaisie {
        super(nom, niveau, force, agilite, intelligence);
    }

    @Override
    public void attaqueBasique(Personnage c) {
        int dommage = force;
        System.out.println(nom +  " utilise Coup d’Épée et inflige " + dommage + " dommages.");
        c.infligeDommages(dommage);
    }

    @Override
    public void attaqueSpecial(Personnage c) {
        int dommage = force * 2;
        System.out.println(nom +  " utilise Coup de Rage et inflige " + dommage + " dommages.");
        c.infligeDommages(dommage);
        int degat = force / 2;
        this.infligeDommages(degat);
    }

    @Override
    public String toString() {
        return "Woarg je suis le Guerrier " + nom +
                " niveau " + niveau +
                " je possède " + vitalite + " de vitalité, " +
                force + " de force, " +
                agilite + " d'agilité et " +
                intelligence + " d'intelligence !";
    }
}

