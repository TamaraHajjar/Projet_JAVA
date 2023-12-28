package com.example.pond_project;
/**
 * La classe Fly représente une mouche dans l'écosystème de l'étang (the pond).
 */
public class Fly extends Animal {
    //instance variables
    private double mass;
    private double speed;
    public static final double DEFAULT_SPEED = 10;
    public static final double DEFAULT_MASS = 5;

    //constructors
    /**
     * Premier constructeur de la classe Fly.
     *
     * @param mass  La masse de la mouche en grammes.
     * @param speed La vitesse de la mouche.
     */
    public Fly (double mass, double speed) {
        super("Fly");
        this.mass = mass;
        this.speed = speed;
    }
    /**
     * Deuxième constructeur de la classe Fly avec une masse spécifiée, la vitesse est prise par défaut égale à DEFAULT_SPEED.
     *
     * @param mass La masse de la mouche en grammes.
     */
    public Fly (double mass) {
        this(mass, DEFAULT_SPEED);
    }
    /**
     * Troisième constructeur de la classe Fly qui ne prend aucun paramètre. La mouche créée via ce constructeur
     * aura une masse et une vitesse égales à DEFAULT_MASS et DEFAULT_SPEED respectivement.
     */
    public Fly () {
        this(DEFAULT_MASS, DEFAULT_SPEED);
    }
    /**
     * Getter qui renvoie la masse de la mouche.
     *
     * @return La masse de la mouche.
     */
    //method
    public double getMass() {
        return mass;
    }
    /**
     * Getter qui renvoie la vitesse de la mouche.
     *
     * @return La vitesse de la mouche.
     */
    public double getSpeed() {
        return speed;
    }
    /**
     * Setter qui permet de modifier la masse de la mouche.
     *
     * @param mass La nouvelle masse de la mouche.
     */
    public void setMass(double mass) {
        this.mass = mass;
    }
    /**
     * Setter qui permet de modifier la vitesse de la mouche.
     *
     * @param speed La nouvelle masse de la mouche.
     */
    public void setSpeed(double speed) {
        this.speed = speed;
    }
    public String toString() {
        if (mass == 0) {
            return "I'm dead, but I used to be a fly with speed of " + speed +".";
        } else {
            return "I'm a speedy fly with " + speed + " speed and " + mass + " mass.";
        }
    }
    /**
     * {@inheritDoc}
     * la masse de la mouche en fonction de la masse spécifiée.
     * @param addedMass la masse à ajouter
     */
    public void grow(int addedMass) {
        int i = 0;
        while (i != addedMass) {
            mass++;
            if (mass <= 20) {
                speed++;
            } else {
                speed = speed - 0.5;
            }
            i++;
        }
    }
    /**
     * Cette méthode précise si la mouche est morte ou non.
     *
     * @return un booléen précisant si la mouche est morte (true) ou non (flase).
     */
    public boolean isDead() {
        if (mass==0) {
            return true;
        } else {
            return false;
        }
    }
}
