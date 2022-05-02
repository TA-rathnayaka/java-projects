package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println("10,000 at 2% interest = " + calculateInterest(10000d, 2d));
        System.out.println("10,000 at 3% interest = " + calculateInterest(10000d, 3d));
        System.out.println("10,000 at 4% interest = " + calculateInterest(10000d, 4d));
        System.out.println("10,000 at 5% interest = " + calculateInterest(10000d, 5d));

        for (int i = 0; i < 5; i++) {
            System.out.println("Loop " + i + " hello");
        }
        for (int interestRate = 9; interestRate < 9; interestRate++) {
            System.out.println("10,000 at " + interestRate + "% interest = " + calculateInterest(10000d, interestRate));
        }
        for (int interestRate = 8; interestRate > 1; interestRate--) {
            System.out.println("10,000 at " + interestRate + "% interest = " + calculateInterest(10000d, interestRate));
        }
        int count = 0;
        for (int n=1; n < 100; n+=2){
            if (isPrime(n)){
                System.out.println("Number "+ n + " is a prime number");
                count += 1;
            }

            if (count == 10){
                break;
            }
        }


    }

    public static double calculateInterest(double amount, double interestRate) {
        return amount * interestRate / 100;
    }

    public static boolean isPrime(int number) {
        if (number == 1) {
            return false;
        }
        for (int i = 2; i < (number / 2); i++) {

            if (number % i == 0) {
                return false;
            }

        }
        return true;
    }
}
