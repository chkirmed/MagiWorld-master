package com.company;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GuerrierTest {

    @Test
    public void Given_GuerrierNiv10_When_attaqueBasique_Then_InfligeGrandValueDommages() {
        Guerrier guerrier = new Guerrier("Test", 10, 10, 0, 0);
        Guerrier cible = new Guerrier("cible", 10, 10, 0, 0);
        guerrier.attaqueBasique(cible);
        assertEquals(50 - 10, cible.getVitalite());
    }

    @Test
    public void Given_GuerrierNiv10_When_attaqueSpecial_Then_InfligeGrandValueDommages() {
        Guerrier guerrier = new Guerrier("Test", 10, 10, 0, 0);
        Guerrier cible = new Guerrier("Enemy", 10, 10, 0, 0);
        guerrier.attaqueSpecial(cible);
        assertEquals(50 - 20, cible.getVitalite());
    }


}