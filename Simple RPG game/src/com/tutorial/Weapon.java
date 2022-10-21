package com.tutorial;

public class Weapon {
    //Attribute
    private String name;
    private int attack;

    //Constructor
    Weapon(String name, int attack){
        this.name = name;
        this.attack = attack;
    }

    //Getter setter
    public int getAttack(){
        return this.attack;
    }

    public String getName(){
        return this.name;
    }
}
