package com.company;

import java.util.Map;

public class IceCreamFactory {
    private Map<String, String> indgredientsQuantiesMap;
    private double optimalFreezerTemperature;
    private String flavor;
    private double gallonsInStock;
    private double quotaForTheMonth;
    private double revenueThisMonth;
    private double wholesalePrice;
    private double smallBatchPrice;

    private void makeABatchOfIceCream(double gallonsToMake) {
        quotaForTheMonth = quotaForTheMonth - gallonsToMake;
        gallonsInStock = gallonsInStock + gallonsToMake;
    }

    private void sellSmallBatch(double gallonsSold) {
            gallonsInStock = gallonsInStock - gallonsSold;
            revenueThisMonth = revenueThisMonth + (smallBatchPrice * gallonsSold);
    }

    private void sellWholesale(double gallonsSold) {
        gallonsInStock = gallonsInStock - gallonsSold;
        revenueThisMonth = revenueThisMonth + (wholesalePrice * gallonsSold);
    }

    private void newMonth(double newQuota) {
        quotaForTheMonth = newQuota;
        revenueThisMonth = 0;
    }


}
