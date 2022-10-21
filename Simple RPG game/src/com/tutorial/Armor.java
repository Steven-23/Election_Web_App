package com.tutorial;

public class Armor {
    //Attribute
    private String name;
    private int strenght;
    private int armorHealth;

    //Constructor
    Armor(String name, int strenght, int armorHealth){
        this.name = name;
        this.strenght = strenght;
        this.armorHealth = armorHealth;
    }

    //Getter setter
    public int getDefence(){
        return this.strenght * 10 + this.armorHealth;
    }

    public String getName(){
        return this.name;
    }
}
