package com.company;

import java.util.Objects;

public class Warrior extends BaseClass{

    private int shieldStrength = 100;
    Warrior(String name){
        super(name, 75, 100, 100, 50, 10);
    }

    public void attack(){
        System.out.println(this.name + " knocks someone out with a mighty blow!!!");
    }

    public void decreaseShieldStrength(){
        System.out.println(this.name + " the mighty warrior loses some shield strength...");
    }

    public int getShieldStrength() {
        return shieldStrength;
    }

    public void setShieldStrength(int shieldStrength) {
        this.shieldStrength = shieldStrength;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Warrior warrior = (Warrior) o;
        return shieldStrength == warrior.shieldStrength;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), shieldStrength);
    }

    @Override
    public String toString() {
        return "Warrior{" +
                "name='" + name + '\'' +
                ", strength=" + strength +
                ", health=" + health +
                ", stamina=" + stamina +
                ", speed=" + speed +
                ", attackPower=" + attackPower +
                ", shieldStrength=" + shieldStrength +
                '}';
    }
}
