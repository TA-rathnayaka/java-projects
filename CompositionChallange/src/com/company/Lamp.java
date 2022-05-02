package com.company;

public class Lamp {
    private String color;
    private boolean isLampOn;

    public Lamp(boolean isLampOn, String color){
        this.isLampOn = isLampOn;
        this.color = color;
    }


    public void turnOn(){
        if (isLampOn){
            System.out.println("The lamp is already turned ON");
        }else {
            System.out.println("The lamp is turned ON");
        }
    }
    public void turnOff(){
        if (isLampOn) {
            System.out.println("The lamp is turned OFF");
        }else {
            System.out.println("The lamp is already turned OFF");
        }
    }
    public void showColor(){
        System.out.println("The lamp is lighting " + color);
    }
    public void switchColor(String color) {
        this.color = color;
        System.out.println("Now the lamp lighting in " + color + "color");
    }

    public String getColor() {
        return color;
    }

    public boolean isLampOn() {
        return isLampOn;
    }

}
