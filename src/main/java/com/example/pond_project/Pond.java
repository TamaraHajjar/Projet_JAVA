package com.example.pond_project;
/**
 * La classe Pond est une classe principale qui contient et exécute des objets Frog et Fly,
 * en simulant une série d'actions dans l'étang (the pond).
 */
public class Pond {
    /**
     * <b> Méthode principale qui agit comme suit : </b>
     * <ul>
     *     <li>
     *         Crée 4 objets Frog.
     *     </li>
     *     <li>
     *         Crée 3 objets Fly.
     *     </li>
     *     <li>
     *         Effectue une série d'opérations spécifiées.
     *     </li>
     * </ul>
     */
    public static void main (String[] args) {
        Frog peepo = new Frog("Peepo");
        Frog pepe = new Frog("Pepe", 10, 15);
        Frog peepaw = new Frog("Peepaw", 4.6, 5);
        Frog frogee = new Frog("Frogee");

        Fly fly1 = new Fly(1, 3);
        Fly fly2 = new Fly(6);
        Fly fly3 = new Fly();

        //1
        peepo.setSpecies("1331 Frogs");
        pepe.setSpecies("1331 Frogs");
        peepaw.setSpecies("1331 Frogs");
        frogee.setSpecies("1331 Frogs");

        //2
        System.out.println(peepo.toString());

        //3
        peepo.eat(fly2);

        //4
        System.out.println(fly2.toString());

        //5
        peepo.grow(8);

        //6
        peepo.eat(fly2);

        //7
        System.out.println(fly2.toString());

        //8
        System.out.println(peepo.toString());

        //9
        System.out.println(frogee.toString());

        //10
        peepaw.grow(4);

        //11
        System.out.println(peepaw.toString());

        //12
        System.out.println(pepe.toString());

    }
}
