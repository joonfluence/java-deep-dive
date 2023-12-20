package org.design_pattern.strategy.v1;

public abstract class Robot {
    private String name;


    public Robot(String name) {
        this.name = name;
    }

    public abstract void attack();
    public abstract void move();

    public String getName() {
        return name;
    }
}

class TaekwonV extends Robot {

    public TaekwonV(String name) {
        super(name);
    }

    @Override
    public void attack() {
        System.out.println("TaekwonV.attack");
    }

    @Override
    public void move() {
        System.out.println("TaekwonV.move");
    }
}

class Atom extends Robot {

    public Atom(String name) {
        super(name);
    }

    @Override
    public void attack() {
        System.out.println("Atom.attack");
    }

    @Override
    public void move() {
        System.out.println("Atom.move");
    }
}
