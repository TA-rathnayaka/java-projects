package com.company;

public class Main {
    public static final String INVALID_VALUE_MESSAGE = "Invalid Value";
    public static void main(String[] args) {
        System.out.println(getDurationString(65, 99 ));
    }
    public static String getDurationString(int minutes, int seconds){
        if (seconds >=0 && seconds <= 59 && minutes >= 0){
            int hours = minutes / 60;
            minutes = minutes % 60;
            String secondString;
            String minutesString;
            String hoursString;
            if (seconds < 10){
                secondString =  "0" + seconds + "s";
            }else{
                secondString =  "" + seconds + "s";
            }
            if (minutes < 10){
                minutesString =  "0" + minutes + "m " ;
            }else{
                minutesString =  "" + minutes + "m " ;
            }
            if (hours < 10){
                hoursString =  "0" + hours + "h ";
            }else{
                hoursString =  "" + hours + "h ";
            }

            return hoursString  + minutesString + secondString ;

        }
        return INVALID_VALUE_MESSAGE;
    }
    public static String getDurationString(int seconds){
        if (seconds >= 0) {
            int minutes = seconds / 60;
            seconds = seconds % 60;
            return getDurationString(minutes, seconds);
        }
        return INVALID_VALUE_MESSAGE;
    }
}
