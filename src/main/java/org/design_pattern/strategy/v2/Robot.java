package org.design_pattern.strategy.v2;

public abstract class Robot {
    private String name;

    private MovingStrategy movingStragegy;
    private AttackStrategy attackStragegy;

    public Robot(String name) {
        this.name = name;
    }

    public void attack(){
        attackStragegy.attack();
    };
    public void move(){
        movingStragegy.move();
    };

    public void setMovingStragegy(MovingStrategy movingStragegy) {
        this.movingStragegy = movingStragegy;
    }

    public void setAttackStragegy(AttackStrategy attackStragegy) {
        this.attackStragegy = attackStragegy;
    }

    public String getName() {
        return name;
    }
}

interface MovingStrategy {
    void move();
}

class FlyingStrategy implements MovingStrategy {

    @Override
    public void move() {
        System.out.println("FlyingStrategy.move");
    }
}


class WalkingStrategy implements MovingStrategy {

    @Override
    public void move() {
        System.out.println("WalkingStrategy.move");
    }
}


interface AttackStrategy {
    void attack();
}

class MissileStrategy implements AttackStrategy {
    @Override
    public void attack() {
        System.out.println("MissileStategy.attack");
    }
}

class PunchStrategy implements AttackStrategy {
    @Override
    public void attack() {
        System.out.println("PunchStrategy.attack");
    }
}

class TaekwonV extends Robot {

    public TaekwonV(String name) {
        super(name);
    }
}

class Atom extends Robot {

    public Atom(String name) {
        super(name);
    }
}
