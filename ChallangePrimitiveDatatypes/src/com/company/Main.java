package com.company;

public class Main {

    public static void main(String[] args) {
        byte myByte = 120;
        short myShort = 1_330;
        int myInteger = 140_656;
        int myLong = 50_000 + 10 * (myInteger + myShort + myByte);
        System.out.println("Total Value = " + myLong);

    }
}
