package com.company;

public abstract class Personnage {
    protected String nom;
    protected int niveau;
    protected int vitalite;
    protected int force;
    protected int agilite;
    protected int intelligence;

    public Personnage(String nom, int niveau, int force, int agilite, int intelligence) throws FauteDeSaisie {
        this.nom = nom;
        this.niveau = niveau;
        this.force = force;
        this.agilite = agilite;
        this.intelligence = intelligence;
        this.vitalite = niveau * 5;

        if (force + agilite + intelligence > niveau)
            throw new FauteDeSaisie();
    }

    public String getNom() {
        return nom;
    }

    public String getNomEtVitalite() {
        return nom + " (" + vitalite + " Vitalité)";
    }

    public int getNiveau() {
        return niveau;
    }

    public int getVitalite() {
        return vitalite;
    }

    public int getForce() {
        return force;
    }

    public int getAgilite() {
        return agilite;
    }

    public int getIntelligence() {
        return intelligence;
    }


    public void infligeDommages(int dommage) {
        this.vitalite -= dommage;
        System.out.println(this.getNom() + " perd " + dommage + " points de vie") ;
        if (this.vitalite <= 0)
            System.out.println(this.getNom() + " est mort");
    }
    /**
     * l'attaque basique du personnage attaquante
     * @param cible la personnage cible
     */

    public abstract void attaqueBasique(Personnage cible);

    /**
     * l'attaque soecial du personnage attaquante
     * @param cible la personnage cible
     */
    public abstract void attaqueSpecial(Personnage cible);

    @Override
    public String toString() {
        return "Character{" +
                "name='" + nom + '\'' +
                ", level=" + niveau +
                ", vitality=" + vitalite +
                ", strength=" + force +
                ", agility=" + agilite +
                ", intelligence=" + intelligence +
                '}';
    }
}

