package com.company;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MagicienTest {
    @Test
    public void Given_MagicienNivl10_When_attaqueBasique_Then_InfligeGrandDommmagesValeur() {
        Magicien mage = new Magicien("Test", 10, 0, 0, 10);
        Magicien cible = new Magicien("cible", 10, 0, 0, 10);
        mage.attaqueBasique(cible);
        assertEquals(50 - 10, cible.getVitalite());
    }

    @Test
    public void Given_MagicienNivl10Et20Vitalite_When_attaqueSpecial_Then_BoireGrandValeurVitalte() {
        Magicien mage = new Magicien("Test", 10, 0, 0, 10);
        Magicien cible = new Magicien("cible", 10, 0, 0, 10);
        mage.infligeDommages(30);
        mage.attaqueSpecial(cible);
        assertEquals(50 - 30 + 20, mage.vitalite);
    }

}