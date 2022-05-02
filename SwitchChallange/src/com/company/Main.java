package com.company;

public class Main {

    public static void main(String[] args) {
        char unknownCharacter = 'C';
        switch (unknownCharacter){
            case 'A':
                System.out.println("Character was A");
                break;
            case 'B':
                System.out.println("Character was B");
                break;
            case 'C': case 'D': case 'E':
                System.out.println("Character was " + unknownCharacter);
                break;
            default:
                System.out.println("Was not character A, B, C, D or E");
        }
    String month = "April";
        switch(month.toLowerCase()){
            case "january":
                System.out.println("Month was January");
                break;
            case "february":
                System.out.println("Month was February");
                break;
            case "march": case "april": case "may": case "june": case "july": case "august": case "september": case "october": case "november": case "december":
                System.out.println("Month was " + month);
                break;
        }
    }
}
