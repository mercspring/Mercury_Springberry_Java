package com.company;

public class App {
    public static void main(String[] args) {

        Warrior Nev = new Warrior("Nev");
        Farmer Sara = new Farmer("Sara");
        Constable Hickory = new Constable("Hickory");

        Hickory.run();
        Hickory.arrest();
        Hickory.attack();
        Hickory.decreaseHealth();
        filler();
        Sara.attack();
        Sara.plow();
        Sara.run();
        Sara.attack();
        filler();
        Nev.heal();
        Nev.decreaseShieldStrength();
        Nev.attack();
        Nev.run();
        filler();
        System.out.println(Nev);
        filler();
        System.out.println(Sara);
        filler();
        System.out.println(Hickory);

    }

    public static void filler() {
        System.out.println("                     ");
        System.out.println("#####################");
        System.out.println("                     ");
    }
}
