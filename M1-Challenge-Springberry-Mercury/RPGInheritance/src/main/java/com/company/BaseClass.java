package com.company;

import java.util.Objects;

public abstract class BaseClass {
    protected String name;
    protected int strength;
    protected int health;
    protected int stamina;
    protected int speed;
    protected int attackPower;

    public BaseClass(String name, int strength, int health, int stamina, int speed, int attackPower) {
        this.name = name;
        this.strength = strength;
        this.health = health;
        this.stamina = stamina;
        this.speed = speed;
        this.attackPower = attackPower;
    }

    BaseClass(){

    }

    public void run(){

        System.out.println(this.name + " runs...");

    }
    public void attack(){

        System.out.println(this.name + " attacks...");
    }
    public void heal(){

        System.out.println(this.name + " heals...");
    }
    public void decreaseHealth(){

        System.out.println(this.name + " decreases in health...");
    }
    public void increaseStamina(){

        System.out.println(this.name + " increases in stamina...");
    }
    public void decreaseStamina(){

        System.out.println(this.name + " decreases in stamina...");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getStamina() {
        return stamina;
    }

    public void setStamina(int stamina) {
        this.stamina = stamina;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getAttackPower() {
        return attackPower;
    }

    public void setAttackPower(int attackPower) {
        this.attackPower = attackPower;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BaseClass baseClass = (BaseClass) o;
        return strength == baseClass.strength && health == baseClass.health && stamina == baseClass.stamina && speed == baseClass.speed && attackPower == baseClass.attackPower && name.equals(baseClass.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, strength, health, stamina, speed, attackPower);
    }

    @Override
    public String toString() {
        return "BaseClass{" +
                "name='" + name + '\'' +
                ", strength=" + strength +
                ", health=" + health +
                ", stamina=" + stamina +
                ", speed=" + speed +
                ", attackPower=" + attackPower +
                '}';
    }
}
