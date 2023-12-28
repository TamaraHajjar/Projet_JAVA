package com.example.pond_project;
/**
 * La classe abstraite Animal représente l'entité animal
 */
public abstract class Animal {
    /**
     * Le nom de l'animal.
     */
    protected String name;
    /**
     * Constructeur de la classe Animal.
     *
     * @param name Le nom de l'animal.
     */
    public Animal(String name) {
        this.name = name;
    }
    /**
     * Cette méthode abstraite fait grandir
     *
     * @param months_or_mass précisé selon la classe qui implémente cette méthode .
     */
    public abstract void grow(int months_or_mass);
    /**
     * Cette méthode abstraite renvoie une représentation sous forme de chaîne de caractères de l'animal.
     *
     * @return La description de l'animal.
     */
    public abstract String toString();
}
