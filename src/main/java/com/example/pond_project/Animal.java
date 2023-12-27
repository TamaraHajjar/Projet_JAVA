package com.example.pond_project;

public abstract class Animal {
    protected String name;

    public Animal(String name) {
        this.name = name;
    }

    public abstract void grow(int months);

    public abstract String toString();
}
