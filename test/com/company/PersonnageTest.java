package com.company;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersonnageTest {
    @Test
    public void Given_MalSaisie_When_CreationNvPersonnage_Then_ThrowException() {
        assertThrows(FauteDeSaisie.class, () -> new Personnage("Test",10, 10, 1, 0) {
            @Override
            public void attaqueBasique(Personnage cible) {

            }

            @Override
            public void attaqueSpecial(Personnage cible) {

            }

        });
    }

    @Test
    public void Given_UnePersonnage_When_PersonnageRecDommage_Then_PersonnagePerdVitalite() {
        Personnage Guerrier = new Personnage("Test", 10, 10, 0, 0) {
            @Override
            public void attaqueBasique(Personnage cible) {

            }

            @Override
            public void attaqueSpecial(Personnage cible) {

            }
        };
        Guerrier.infligeDommages(10);
        assertEquals(50 - 10,  Guerrier.getVitalite());
    }
}
