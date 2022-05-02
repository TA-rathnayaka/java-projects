package com.company;

public class Main {

    public static void main(String[] args) {
        double doubleFirst = 20.00d;
        double doubleSecond = 80.00d;
        double result = (doubleFirst + doubleSecond) * 100.00d;
        double remainder = result % 40.00d;
        boolean isDivide = (remainder == 0d) ? true: false;
        System.out.println("Is Divide by 40 = " + isDivide);
        if (!isDivide) {
            System.out.println("Got some remainder");
        }
    }
}
