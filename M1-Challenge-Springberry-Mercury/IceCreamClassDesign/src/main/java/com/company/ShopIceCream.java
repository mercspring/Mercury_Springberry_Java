package com.company;

public class ShopIceCream {
    public double salePricePerScoop;
    public double gallonsInInventory;
    public String flavor;
    public String expirationDate;
    public double pricePerGallonFromVendor;

    private double scoopsPerGallon = 24.0;


    public void sellScoops(int scoopsSold){
        this.gallonsInInventory = this.gallonsInInventory - (1 / 24.0) * scoopsSold;
    }

    public void buyInventory(double gallonsBought){
        this.gallonsInInventory = this.gallonsInInventory + gallonsBought;
    }

    public void checkInventory(String currentDate, double gallonsToBuy){
        if(expirationDate.equals(currentDate)){
            this.destroyInventory();
        }
    }
    public void destroyInventory(){
        this.gallonsInInventory = 0;
    }




}
