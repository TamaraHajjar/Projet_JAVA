package com.example.pond_project;

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
    public Frog (String name, int age, double tongueSpeed) {
        super(name);
        this.age = age;
        this.tongueSpeed = tongueSpeed;
        this.isFroglet(age);
    }

    public Frog (String name, double ageInYears, double tongueSpeed) {
        this(name, (int)(ageInYears*12), tongueSpeed);
        this.isFroglet(age);
    }

    public Frog (String name) {
        this(name, DEFAULT_AGE, DEFAULT_TONGUESPEED);
        this.isFroglet(age);
    }

    //method
    private void isFroglet(int age) {
        if (age>1 && age<7) {
            isFroglet = true;
        } else {
            isFroglet = false;
        }
    }

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
            return "My name is " + name + " and I'm a rare froglet! I'm " + age + " months old and my tongue has a speed of " + tongueSpeed + ".";
        } else {
            return "My name is " + name + " and I'm a rare frog. I'm " + age + " months old and my tongue has a speed of " + tongueSpeed + ".";
        }
    }
    public void setSpecies (String Newspecies) {
        this.species = Newspecies;
    }

}
