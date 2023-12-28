package com.example.pond_project;
/**
 * L'interface Eater représente des entités qui peuvent manger.
 */
public interface Eater {
    /**
     * Cette méthode permet à une grenouille de manger une mouche.
     *
     * @param fly La mouche à manger.
     */
    void eat(Fly fly);
}
