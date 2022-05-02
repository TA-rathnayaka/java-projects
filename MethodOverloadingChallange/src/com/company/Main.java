package com.company;

public class Main {

    public static void main(String[] args) {
        calcFeetAndInchesToCentimeters(-10);
    }
    public static double calcFeetAndInchesToCentimeters(double feet, double inches){
        if (feet >= 0 && inches >= 0 && inches <= 12){
            double centimeters = (inches * 2.54 ) + (feet * 30.48);
            System.out.println(feet + " feet " + inches + " inches = "  + centimeters + " cm ");
            return centimeters;
        }
        System.out.println("Invalid inches or feet parameters");
        return -1;
    }
    public static double calcFeetAndInchesToCentimeters(double inches) {
        if (inches >= 0) {
            int feet = (int) inches / 12;
            inches = inches % 12 ;
            return calcFeetAndInchesToCentimeters(feet, inches);

        }
        System.out.println("Invalid inches or feet parameters");
        return -1;
    }

}
