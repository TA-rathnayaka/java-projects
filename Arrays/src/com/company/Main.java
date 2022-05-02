package com.company;

import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int[] intArray = getIntegers(5);
        for (int i = 0; i < intArray.length; i++){
            System.out.println("The " + i + " index value is " + intArray[i]);
        }
        System.out.println("Average of entered numbers = " + average(intArray));
    }
    public static int[] getIntegers(int number){
        int[] values = new int[number];
        System.out.println("Enter " + number + " values \r");
        for (int i = 0; i < values.length; i++) {
            values[i] = scanner.nextInt();
            scanner.nextLine();

        }
        return values;
    }
    public static double average(int[] array) {
        double sum = 0;
        for (int i = 0; i < array.length; i++){
            sum += array[i];
        }
        return (sum/array.length);
    }
}
