package com.company;

public class ConverterApplication {
    public static void main(String[] args) {
        ConvertSwitch convertSwitch = new ConvertSwitch();
        ConvertIf convertIf = new ConvertIf();
        //Some Example usage
        System.out.println(convertSwitch.convertDay(2));
        System.out.println(convertSwitch.convertDay(5));
        System.out.println(convertIf.convertDay(7));
        System.out.println(convertIf.convertDay(2));

        System.out.println(convertSwitch.convertMonth(2));
        System.out.println(convertSwitch.convertMonth(12));
        System.out.println(convertIf.convertMonth(8));
        System.out.println(convertIf.convertMonth(3));
    }
}
