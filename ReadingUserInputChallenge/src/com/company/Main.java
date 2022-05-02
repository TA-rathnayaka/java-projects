package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = 1;
        int sum = 0;
        while (count <= 10) {
            System.out.println("Enter Number #" + count + ":");

            boolean hasNextInt = scanner.hasNextInt();
            if (hasNextInt) {
                int enteredNumber = scanner.nextInt();
                sum += enteredNumber;
                count++;
            } else {
                System.out.println("Invalid Number");

            }
            scanner.nextLine();

        }
        scanner.close();
        System.out.println("The sum of numbers you have entered are " + sum);
    }
}
