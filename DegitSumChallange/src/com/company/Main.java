package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println("The sum of digits in number 125 is " + sumDigits(125));
        System.out.println("The sum of digits in number -125 is " + sumDigits(-125));
        System.out.println("The sum of digits in number 4 is " + sumDigits(4));
        System.out.println("The sum of digits in number 32125 is " + sumDigits(32123));

    }
    public static int sumDigits(int number){
        if (number >=10){
            int sum = 0;
            while (true){
                sum += number % 10;
                number /= 10 ;
                if (number == 0){
                    break;
                }
            }
            return sum;
        }
        return -1;
    }
}
