package org.design_pattern.strategy.v2;

public class Client {
    public static void main(String[] args) {
        Robot taekwonV = new TaekwonV("TaekwonV");
        Robot atom = new Atom("Atom");

        taekwonV.setAttackStragegy(new MissileStrategy());
        taekwonV.setMovingStragegy(new WalkingStrategy());

        atom.setAttackStragegy(new PunchStrategy());
        atom.setMovingStragegy(new FlyingStrategy());

        System.out.println("My Name is " + taekwonV.getName());
        taekwonV.move();
        taekwonV.attack();

        System.out.println();

        System.out.println("My Name is " + atom.getName());
        atom.move();
        atom.attack();
    }
}
