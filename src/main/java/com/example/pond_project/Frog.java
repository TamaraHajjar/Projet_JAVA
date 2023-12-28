package com.example.pond_project;
/**
 * La classe Frog représente une grenouille dans l'écosystème de l'étang (the pond).
 */
public class Frog extends Animal implements Eater {
    //instance variables
    private String name;
    private int age;
    private double tongueSpeed;
    private boolean isFroglet;
    private static String species = "Rare Pepe";
    public static final int DEFAULT_AGE = 5;
    public static final double DEFAULT_TONGUESPEED = 5;

    //constructors
    /**
     * Premier constructeur de la classe Frog.
     *
     * @param name Le nom de la grenouille.
     * @param age L'âge de la grenouille en mois.
     * @param tongueSpeed La vitesse de la langue de la grenouille.
     * A noter qu'un appel de la méthode isFroglet() est effectué comme dernière instruction
     * dans le constructeur pour mettre à jour l'état de la grenouille (si elle est froglet ou non)
     */
    public Frog (String name, int age, double tongueSpeed) {
        super(name);
        this.age = age;
        this.tongueSpeed = tongueSpeed;
        this.isFroglet(age);
    }
    /**
     * Deuxième constructeur de la classe Frog avec l'âge en années.
     *
     * @param name Le nom de la grenouille.
     * @param ageInYears L'âge de la grenouille en années.
     * @param tongueSpeed La vitesse de la langue de la grenouille.
     * A noter qu'un appel de la méthode isFroglet() est effectué comme dernière instruction
     * dans le constructeur pour mettre à jour l'état de la grenouille (si elle est froglet ou non)
     */
    public Frog (String name, double ageInYears, double tongueSpeed) {
        this(name, (int)(ageInYears*12), tongueSpeed);
        this.isFroglet(age);
    }

    /**
     * Troisirme constructeur de la classe Frog.
     * La grenouille créée via ce constructeur aura un âge et une vitesse de langue
     * égales à DEFAULT_AGE et DEFAULT_TONGUESPEED respectivement.
     * @param name Le nom de la grenouille.
     */
    public Frog (String name) {
        this(name, DEFAULT_AGE, DEFAULT_TONGUESPEED);
        this.isFroglet(age);
    }

    //method

    /**
     * Cette méthode détérmine si la grenouille est un froglet ou non.
     * Elle donne la valeur "true" à l'attribut booléen isFroglet si la grenouille est un froglet.
     * Sinon, l'attribut isFroglet sera égal à "false"
     */

    private void isFroglet(int age) {
        if (age>1 && age<7) {
            isFroglet = true;
        } else {
            isFroglet = false;
        }
    }

    /**
     * {@inheritDoc}
     * l'âge de la grenouille en fonction du nombre de mois spécifié.
     * @param month le nombre de mois à ajouter
     */
    public void grow (int month) {
        age += month;
        if (age<12) {
            tongueSpeed = tongueSpeed + (1*month);
        } else if (age >= 30) {
            if ((tongueSpeed - (1*(age-30)) >= 5)) {
                tongueSpeed = tongueSpeed - (1*(age-30));
            }
        }
        this.isFroglet(age);
    }
    /**
     * Cette méthode fait un overload de la méthode grow précédente.
     * Même fonctionnement que la précédente, mais en spécifiant le nombre de mois à 1
     */
    public void grow () {
        grow(1);
    }

    public void eat (Fly fly) {
        if (fly.isDead()) {
            return;
        }
        if (tongueSpeed > fly.getSpeed()) {
            System.out.println("The fly is caught!");
            if (fly.getMass() >= (0.5*age)) {
                this.grow();
            }
            fly.setMass(0);
        } else {
            fly.grow(1);
        }
    }

    public String toString() {
        if (isFroglet) {
            return "My name is " + name + " and I'm a rare froglet! I'm " + age + " months old and my tongue has a speed of " + String.format("%.2f",tongueSpeed) + ".";
        } else {
            return "My name is " + name + " and I'm a rare frog. I'm " + age + " months old and my tongue has a speed of " + String.format("%.2f",tongueSpeed) + ".";
        }
    }
    /**
     * Setter qui permet de modifier l'éspèce à laquelle appartient une grenouille.
     *
     * @param Newspecies La nouvelle éspèce de la grenouille.
     */
    public void setSpecies (String Newspecies) {
        this.species = Newspecies;
    }

}
