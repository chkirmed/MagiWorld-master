package com.company;

public class Magicien extends Personnage {

    public Magicien(String nom, int niveau, int force, int agilite, int intelligence) throws FauteDeSaisie {
        super(nom, niveau, force, agilite, intelligence);
    }

    @Override
    public void attaqueBasique(Personnage cible) {
        int dommage = intelligence;
        System.out.println(nom +  " utilise  Boule de Feu et inflige " + intelligence + " dommages.");
        cible.infligeDommages(dommage);
    }

    @Override
    public void attaqueSpecial(Personnage cible) {
        int vitalitePlus = intelligence * 2;
        int nvVitalite = vitalite + vitalitePlus;
        if (nvVitalite > niveau * 5)
            nvVitalite = niveau * 5;
        System.out.println(nom +  " utilise Soin et gagne " + (nvVitalite - vitalite) + " en vitalité.");
        vitalite = nvVitalite;
    }

    @Override
    public String toString() {
        return "Abracadabra je suis le Mage " + nom +
                " niveau " + niveau +
                " je possède " + vitalite + " de vitalité, " +
                force + " de force, " +
                agilite + " d'agilité et " +
                intelligence + " d'intelligence !";
    }
}
