package com.company;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RodeurTest {
    @Test
    public void Given_RodeurNivl10_When_attaqueBasique_Then_InfligeGrandValeurDommages() {
        Rodeur rodeur = new Rodeur("Test", 10, 0, 10, 0);
        Rodeur cible = new Rodeur("Enemy", 10, 0, 10, 0);
        rodeur.attaqueBasique(cible);
        assertEquals(50 - 10, cible.getVitalite());
    }

    @Test
    public void Given_RodeurNiv10_When_attaqueSpecial_Then_BoireGrandValeurAgilite() {
        Rodeur rodeur = new Rodeur("Test", 10, 0, 10, 0);
        Rodeur cible = new Rodeur("Enemy", 10, 0, 10, 0);
        rodeur.attaqueSpecial(cible);
        assertEquals(10 + 5, rodeur.agilite);
    }
}