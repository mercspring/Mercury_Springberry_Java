package com.company;

import java.util.Calendar;

public class App {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        System.out.println("Performing: 1 + 1");
        System.out.println("result:" + calculator.add(1,1) + "\n");

        System.out.println("Performing: 23 - 52");
        System.out.println("result:" + calculator.subtract(23,52) + "\n");

        System.out.println("Performing: 34 * 2");
        System.out.println("result:" + calculator.multiply(34,2) + "\n");

        System.out.println("Performing: 12 / 3");
        System.out.println("result:" + calculator.divide(12,3) + "\n");

        System.out.println("Performing: 12 / 7");
        System.out.printf("result: %d%n%n", calculator.divide(12,7) );

        System.out.println("Performing: 3.4 + 2.3");
        System.out.printf("result: %.2f%n%n", calculator.add(3.4,2.3));

        System.out.println("Performing: 6.7 * 4.4");
        System.out.printf("result: %.2f%n%n", calculator.multiply(6.7,4.4));

        System.out.println("Performing: 5.5 - 0.5");
        System.out.printf("result: %.2f%n%n", calculator.subtract(5.5,0.5));

        System.out.println("Performing: 5.5 / 0.5");
        System.out.printf("result: %.2f%n%n", calculator.divide(5.5,0.5));
    }
}
