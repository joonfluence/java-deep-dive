package org.design_pattern.strategy.v1;

public class Client {
    public static void main(String[] args) {
        Robot taekwonV = new TaekwonV("TaekwonV");
        Robot atom = new Atom("Atom");

        System.out.println("My Name is " + taekwonV.getName());
        taekwonV.move();
        taekwonV.attack();

        System.out.println();

        System.out.println("My Name is " + atom.getName());
        atom.move();
        atom.attack();
    }
}
