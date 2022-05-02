package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println(area(7));
    }

    public static double area(double radius) {
        if (radius >= 0) {
            return (radius * radius) * Math.PI;
        }
        return -1d;
    }

    public static double area(double x, double y) {
        if (x > 0 && y > 0) {
            return x * y;
        }

        return -1d;
    }
}
