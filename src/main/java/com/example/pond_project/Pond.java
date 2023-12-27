package com.example.pond_project;

public class Pond {
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
