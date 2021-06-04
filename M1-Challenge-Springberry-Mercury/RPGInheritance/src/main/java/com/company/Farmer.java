package com.company;

public class Farmer extends BaseClass{

   Farmer(String name) {
      super(name, 75, 100, 75, 10, 1);
   }

   Farmer(){
   }

   public void run(){
      System.out.println(this.name + " the farmer runs away slowly...");
   }

   public void plow(){
      System.out.println(this.name + " plows...");
   }
   public void harvest(){
      System.out.println(this.name + " harvests...");
   }

   @Override
   public String toString() {
      return "Farmer{" +
              "name='" + name + '\'' +
              ", strength=" + strength +
              ", health=" + health +
              ", stamina=" + stamina +
              ", speed=" + speed +
              ", attackPower=" + attackPower +
              '}';
   }
}
