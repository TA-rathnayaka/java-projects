package com.company;

public class Main {

    public static void main(String[] args) {
//        int value = 3;
//        if (value == 1){
//            System.out.println("Value was 1");
//        }
//        else if (value == 2) {
//            System.out.println("Value was 2");
//        }
//        else {
//            System.out.println("Was not 1 or 2");
//        }
        int switchValue = 3;

        switch(switchValue){
            case 1:
                System.out.println("Value was 1");
                break;
            case 2:
                System.out.println("Value was 2");
                break;
            case 3: case 4: case 5:
                System.out.println("Value is 3 or 4 or 5");
                System.out.println("Actually the value was " + switchValue);
                break;
            default:
                System.out.println("Was not 1 or 2 or 3 or 5");
                break;
        }

    }
}
