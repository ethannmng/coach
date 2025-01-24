package com.example.coach.modele;

public class Profil {

    private static final Integer minFemme = 15; // MAIGRE si en-dessous
    private static final Integer maxFemme = 30; // GROS si au-dessus
    private static final Integer minHomme = 10; // MAIGRE si en-dessous
    private static final Integer maxHomme = 25; // GROS si au-dessus

    private int poids;
    private int taille;
    private int age;
    private int sexe;

    private float IMG;

    private String message = "";

    /**
     * Constructeur : valorise directement les proriétés poids, taille, age, sexe
     * @param poids
     * @param taille
     * @param age
     * @param sexe 1 pour homme, 0 pour femme
     */
    public Profil(int poids, int taille, int age, int sexe) {
        this.poids = poids;
        this.taille = taille;
        this.age = age;
        this.sexe = sexe;
    }

    public int getPoids() {
        return poids;
    }

    public int getTaille() {
        return taille;
    }

    public int getAge() {
        return age;
    }

    public int getSexe() {
        return sexe;
    }

    /**
     * Retourne IMG après l'avoir calculé s'il est vide
     * @return IMG
     */
    public float getIMG() {
        if(IMG == 0){
            float tailleCm = ((float)taille)/100;
            IMG = (float)((1.2 * poids/(tailleCm*tailleCm)) + (0.23 * age) - (10.83 * sexe) - 5.4);
        }
        return IMG;
    }

    /**
     * retourne le message correspondant à l'img
     * @return message "normal", "trop faible", "trop élevé"
     */
    public String getMessage() {
        if(message.equals("")){
            message = "normal";
            Integer min = minFemme, max = maxFemme;
            if(sexe == 1){
                min = minHomme;
                max = maxHomme;
            }
            IMG = getIMG();
            if (IMG<min) {
                message = "trop faible";
            } else {
                if (IMG>max) {
                    message = "trop élevé";
                }
            }
        }
        return message;
    }
}
