package com.tutorial;

public abstract class Player {
    //Attribute
    private String name;
    private int baseHealth;
    private int baseAttack;
    private int magicDmg;
    private int level;
    private int increment;
    private int exp;
    private String role;
    Weapon weapon;
    Armor armor;

    protected Player(String name, String role){
        this.name = name;
        this.role = role;
        this.baseHealth = 100;
        this.baseAttack = 30;
        this.level = 1;
        this.increment = 20;
    }

    protected void display(){
        System.out.println();
        System.out.println("Name\t: " + this.name);
        System.out.println("Health\t: " + this.maxHealth());
        System.out.println("Attack\t: " + this.maxAttack());
		System.out.println("Level\t: " + this.level);
		System.out.println("Armor\t: " + armor.getName());
		System.out.println("Weapon\t: " + weapon.getName());
    }

    public void setWeapon(Weapon weapon){
        this.weapon = weapon;
    }

    public void setArmor(Armor armor){
        this.armor = armor;
    }

    public abstract double maxHealth();

    public abstract double maxAttack();

    public double setMaxHealthKnight(double bonusDefence){
        return this.baseHealth + this.armor.getDefence() + (this.armor.getDefence() * bonusDefence) + this.level * this.increment;
    }

    public double setMaxAttackKnight(double attack){
        return this.baseAttack + this.weapon.getAttack() + (this.weapon.getAttack() * attack) + this.level * this.increment;
    }

    private int levelUp(){
        return this.level++;
    }

    void verifyLevelUp(){
        if(this.exp / 100 >= 1){
            levelUp();
            this.exp -= 100;
        }else{
            System.out.println(100 - this.exp + " exp left to level up");
        }
        System.out.println(this.name + " exp : " + this.exp);
    }

    void Attack(Player opponent){
        int damage = this.maxAttack();
        System.out.println(this.name + " Attack " + opponent.name);
        System.out.println(opponent.name + " gets damage " + damage);
        opponent.baseHealth -= damage;
        this.exp += damage;
    }
}
