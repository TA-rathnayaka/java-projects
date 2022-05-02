package com.company;
public class Bed {
    private Dimension dimension;
    private boolean isBedArrange;
    private String color;

    public Bed(Dimension dimension, boolean isBedArrange, String color) {
        this.dimension = dimension;
        this.isBedArrange = isBedArrange;
        this.color = color;
    }

    public Dimension getDimension() {
        return dimension;
    }
    public void rearrange(){
        System.out.println("Bed is rearranged");
    }

    public boolean isBedArrange() {
        return isBedArrange;
    }

    public String getColor() {
        return color;
    }
}
