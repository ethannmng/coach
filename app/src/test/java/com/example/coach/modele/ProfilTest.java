package com.example.coach.modele;

import static org.junit.Assert.*;

import org.junit.Test;

public class ProfilTest {

    // Création d'un profil - femme de 67kg, 1m65, 35ans
    private Profil profil = new Profil(67, 165, 35, 0);
    // Résultat de l'IMG correspondant
    private float IMG = (float)32.2;
    // Message correspondant
    private String message = "trop élevé";

    @Test
    public void getIMG() {
        assertEquals(IMG, profil.getIMG(), (float)0.1);
    }

    @Test
    public void getMessage() {
        assertEquals(message, profil.getMessage());
    }
}