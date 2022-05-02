package com.company;

public class Main {

    public static void main(String[] args) {
        int count = 1;
//        while (count != 6) {
//            System.out.println("Count Value " + count);
//            count++;
//        }
//       for (int count = 1; count != 6; count++) {
//          System.out.println("Count Value " + count);
//          }
//        count = 1;
//        while (true) {
//            if (count == 6) {
//                break;
//            }
//            System.out.println("Count Value " + count);
//            count++;
//        }
//        count = 1;
//        do {
//            System.out.println("Count Value " + count);
//            count++;
//        } while (count !=6);

        int number = 4;
        int numberOfEvenNumbers = 0;
        int finishNumber = 20;
        while (number <= finishNumber){
            number++;
            if (!isEvenNumber(number)) {
                continue;
            }
            numberOfEvenNumbers++;
            System.out.println(number + " is a even number");
            if (numberOfEvenNumbers == 5){
                break;
            }



        }
        System.out.println("Number of even numbers " + numberOfEvenNumbers);
    }


    public static boolean isEvenNumber(int number) {
        if (number % 2 == 0) {
            return true;
        }
        return false;
    }
}

