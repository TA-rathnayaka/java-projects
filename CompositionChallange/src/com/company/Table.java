package com.company;

import java.awt.*;

public class Table {
    private String shape;
    private Dimension dimension;
    private String color;

    public Table(String shape, Dimension dimension, String color) {
        this.shape = shape;
        this.dimension = dimension;
        this.color = color;
    }

    public void moveTable() {
        System.out.println("Table is moved");
    }
    public void rearrange(){
        System.out.println("Table is rearranged");
    }

    public String getShape() {
        return shape;
    }

    public Dimension getDimension() {
        return dimension;
    }

    public String getColor() {
        return color;
    }
}
