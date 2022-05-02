package com.company;

public class Main {

    public static void main(String[] args) {
        int myValue = 10000;
        int myMaxIntegerValue = Integer.MAX_VALUE;
        int myMinIntegerValue = Integer.MIN_VALUE;
        System.out.println("Integer Minimum Value" + myMinIntegerValue);
        System.out.println("Integer Maximum Value" + myMaxIntegerValue);
        System.out.println("Busted Min value =" + (myMinIntegerValue - 1));
        System.out.println("Busted Max value =" + (myMaxIntegerValue + 1));

        byte myMinimumByteValue = Byte.MIN_VALUE;
        byte myMaximumByteValue = Byte.MAX_VALUE;
        System.out.println("Byte Minimum Value =" + myMinimumByteValue);
        System.out.println("Byte Maximum Value =" + myMaximumByteValue);

        short myMinimumShortValue = Short.MIN_VALUE;
        Short myMaximumShortValue = Short.MAX_VALUE;
        System.out.println("Short Minimum Value =" + myMinimumShortValue);
        System.out.println("Short Maximum Value =" + myMaximumShortValue);
        
        long myMinimumLongValue = Long.MAX_VALUE;
        long myMaximumLongValue = Long.MAX_VALUE;
        System.out.println("long Minimum Value =" + myMinimumLongValue);
        System.out.println("long Maximum Value =" + myMaximumLongValue);

        int myTotalIntegerValue = (myMaxIntegerValue / 2);
        System.out.println(myTotalIntegerValue);

        byte myTotalByteValue = (byte) (myMaximumByteValue / 2);
        System.out.println(myTotalByteValue);

        short myTotalShortValue = (short) (myMaximumShortValue / 2);
        System.out.println(myTotalShortValue);

        long myTotalLongValue = (long) (myMaximumLongValue / 2);
        System.out.println(myTotalLongValue);

    }
}
