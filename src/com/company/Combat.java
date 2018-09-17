package com.company;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Combat {
    Personnage joueur1;
    Personnage joueur2;

    private Scanner sc = new Scanner(System.in);

    /**
     * Run the game
     * Started by characters creation then turn to turn fight.
     */
    public void run() {
        System.out.println("Création du personnage du Joueur 1");
        joueur1 = creerPersonnage("Joueur 1");
        System.out.println(joueur1);
        System.out.println("Création du personnage du Joueur 2");
        joueur2 = creerPersonnage("Joueur 2");
        System.out.println(joueur2);
        while (joueur1.getVitalite() > 0 && joueur2.getVitalite() > 0) {
            faireJouer(joueur1, joueur2);
            if (joueur2.getVitalite() > 0)
                faireJouer(joueur2, joueur1);
        }
        if (joueur1.getVitalite() <= 0)
            System.out.println(joueur1.getNom() + " a perdu !");
        if (joueur2.getVitalite() <= 0)
            System.out.println(joueur2.getNom() + " a perdu !");
    }

    void faireJouer(Personnage premierJoueur, Personnage secondeJoueur) {
        int typeAttaque = controlerSaisieEntier(premierJoueur.getNomEtVitalite() + " veuillez choisir votre action (1 : Attaque Basique, 2 : Attaque Spéciale)", 1, 2);
        if (typeAttaque == 1)
            premierJoueur.attaqueBasique(secondeJoueur);
        else
            premierJoueur.attaqueSpecial(secondeJoueur);
    }

    Personnage creerPersonnage(String nom) {
        Personnage personne = null;
        do {
            int classPersonnage = controlerSaisieEntier("Veuillez choisir la classe de votre personnage (1 : Guerrier, 2 : Rôdeur, 3 : Mage)", 1, 3);
            int niveau = controlerSaisieEntier("Niveau du personnage ?", 1, 100);
            int force = controlerSaisieEntier("Force du personnage ?", 0, 100);
            int agilite = controlerSaisieEntier("Agilité du personnage ?", 0, 100);
            int intelligence = controlerSaisieEntier("Intelligence du personnage ?", 0, 100);
            try {
                switch ( classPersonnage) {
                    case 1 :
                        personne = new Guerrier(nom, niveau, force, agilite, intelligence);
                        break;
                    case 2 :
                        personne = new Rodeur(nom, niveau, force, agilite, intelligence);
                        break;
                    case 3 :
                        personne = new Magicien(nom, niveau, force, agilite, intelligence);
                        break;
                }
            } catch (FauteDeSaisie e) {
                System.err.println("Merci de saisir un total de points de caractéristiques égal au niveau de votre personnage.");
                personne = null;
            }
        } while (personne == null);
        return personne;
    }

    int controlerSaisieEntier(String question, int minValeur, int maxValeur) {
        System.out.println(question);
        int valeur = -1;
        boolean valueIsGood;
        do {
            try {
                valeur = sc.nextInt();
                valueIsGood = true;
            } catch (InputMismatchException e) {
                sc.next();
                System.err.println("Merci de saisir une valeur valide");
                valueIsGood = false;
            }
            if (valeur < minValeur) {
                System.err.println("Merci de saisir une valeur supérieure ou égale à " + minValeur);
                valueIsGood = false;
            }
            if (valeur > maxValeur) {
                System.err.println("Merci de saisir une valeur inférieure ou égale à " + maxValeur);
                valueIsGood = false;
            }
        } while (!valueIsGood);
        return valeur;
    }
}


