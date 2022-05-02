package com.company;

import java.time.Year;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your birth year : ");
        boolean hasNextInt = scanner.hasNextInt();
        if (hasNextInt) {
            int birthYear = scanner.nextInt();

            scanner.nextLine();

            int age = 2022 - birthYear;
            if (age >= 0 && age <= 100) {
                System.out.println("Enter your Name : ");
                String name = scanner.nextLine();
                System.out.println("Your name is " + name + " and you are " + age + " years old");
            } else {
                System.out.println("Invalid year of birth");
            }


        } else {
            System.out.println("Unable to phrase year of birth");
        }


        scanner.close();


    }
}
