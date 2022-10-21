package com.tutorial;

public class Knight extends Player{


    protected Knight(String name, String role) {
        super(name, role);
        //TODO Auto-generated constructor stub
    }

    @Override
    public double maxHealth() {
        // TODO Auto-generated method stub
        return setMaxHealthKnight(0.2);
    }

    @Override
    public double maxAttack() {
        // TODO Auto-generated method stub
        return setMaxAttackKnight(0);
    }
}
