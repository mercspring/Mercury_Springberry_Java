package com.company;

import java.util.Objects;

public class Constable extends BaseClass{

    private String jurisdiction;

    Constable(String name){
        super(name, 60, 100, 60,20,5);
    }
    Constable(){

    }

    public void attack(){
        System.out.println(this.name + " the constable hits someone weakly...");
    }

    public void arrest(){
        System.out.println(this.name + " the constable arrests someone...");
    }

    public String getJurisdiction() {
        return jurisdiction;
    }

    public void setJurisdiction(String jurisdiction) {
        this.jurisdiction = jurisdiction;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Constable constable = (Constable) o;
        return Objects.equals(jurisdiction, constable.jurisdiction);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), jurisdiction);
    }

    @Override
    public String toString() {
        return "Constable{" +
                "name='" + name + '\'' +
                ", strength=" + strength +
                ", health=" + health +
                ", stamina=" + stamina +
                ", speed=" + speed +
                ", attackPower=" + attackPower +
                ", jurisdiction='" + jurisdiction + '\'' +
                '}';
    }
}
