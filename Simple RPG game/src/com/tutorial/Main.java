package com.tutorial;

public class Main {

    public Main(){
        /*Role
        - Knight : Sword        | + 20% Defence
        - Archer : Bow          | - 10% Basic Health && 10% Bonus Attack
        - Mage   : Magic, Book  | - 30% Basic Health && 30% Bonus Attack
        */

        //Player
        Knight player2 = new Knight("Josh", "Knight");

        //Weapon
        Weapon weapon1 = new Weapon("Iron Sword", 20);

        //Armor
        Armor armor1 = new Armor("Iron Armor", 3, 100);

        //Execute
        player2.setArmor(armor1);
        player2.setWeapon(weapon1);

        player2.display();
    }

    public static void main(String[] args) {
        new Main();
    }
}
