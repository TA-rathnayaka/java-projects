package com.company;

public class Main {

    public static void main(String[] args) {

        int result = 2 + 1; //  2 + 1 = 3
        System.out.println("2 + 3 = " + result);
        int previousResult = result;
        result = result - 1; //  3 - 1 = 2
        System.out.println("3 - 1 = " + result);
        System.out.println("Previous Result = " + previousResult );
        result = result * 10 ; // 2 * 10 = 20
        System.out.println("2 * 10 = " + result);
        result = result / 5; // 20 / 5 = 4
        System.out.println("20 / 5 = " + result);
        result = result % 3; // 4 % 3 = 1
        System.out.println("4 % 3 = " + result);

        // result = result + 1
        result++;
        System.out.println("1 + 1 = " +  result);

        // result = result - 1
        result--;
        System.out.println("2 - 1 = " + result);

        //result = result + 2
        result += 2;
        System.out.println("1 + 2 = " + result);

        //result = result -2
        result -=2;
        System.out.println("3 - 2 = " + result);

        result *= 10;
        System.out.println("1 * 10 = " + result);

        boolean isAlien = false;
        if (isAlien == false) {
            System.out.println("It's not an alien");
            System.out.println("I'm Scared of aliens");
        }
        int topScore = 80;
        if (topScore < 100) {
            System.out.println("You are in the highest score");
        }
        int secondScore = 50;
        if (topScore > secondScore && topScore < 100){
            System.out.println("Greater than second top score and less than 100");
        }
        if ((topScore > 90 ) || (secondScore <=90)){
            System.out.println("Either or only one of the conditions are true");
        }
        int newValue = 50;
        if (newValue == 50){
            System.out.println("This is true");
        }
        boolean isCar = false;
        if (isCar == true) {
            System.out.println("This is not suppose to happened");
        }

        boolean wasCar = (isCar) ? true : false;
        if (wasCar){
            System.out.println("The name of the operator in ? is ternary");
        }
        
    }
}
