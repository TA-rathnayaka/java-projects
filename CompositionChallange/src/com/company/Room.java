package com.company;

public class Room {
    private String color;
    private Dimension dimension;
    private Table table;
    private Bed bed;
    private Window window;
    private Lamp lamp;
    private int numberOfWindows;

    public Room(String color, Dimension dimension, Table table, Bed bed, Window window, Lamp lamp, int numberOfWindows) {
        this.color = color;
        this.dimension = dimension;
        this.table = table;
        this.bed = bed;
        this.window = window;
        this.lamp = lamp;
        this.numberOfWindows = numberOfWindows;
    }
    private void sweepRoom(){
        System.out.println("The room is swept");
    }
    public void rearrangeRoom(){
        table.rearrange();
        bed.rearrange();
        sweepRoom();
    }
    public void getFreshAir(){
        window.open();
    }
    public void closeAllWindows(){
        window.close();
        System.out.println("All windows were closed");
    }
    public void paint(String color){
        this.color = color;
        System.out.println("Color is changed to " + color);
    }
    public void turnOnLight(){
        lamp.turnOn();
    }
    public void turnOffLight(){
        lamp.turnOff();
    }

    public String getColor() {
        return color;
    }

    public Dimension getDimension() {
        return dimension;
    }

    public Table getTable() {
        return table;
    }

    public Bed getBed() {
        return bed;
    }

    public Window getWindow() {
        return window;
    }

    public Lamp getLamp() {
        return lamp;
    }
}
