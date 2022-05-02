package com.company;

public class Window {
    private int height;
    private int width;
    private boolean isOpen;

    public Window(int height, int width, boolean isOpen) {
        this.height = height;
        this.width = width;
        this.isOpen = isOpen;
    }
    public void close(){
        if (isOpen){
            System.out.println("Window is closed");
            isOpen = false;
        }
        else {
            System.out.println("Window is already closed");
        }
    }
    public void open(){
        if (isOpen) {
            System.out.println("Window is already opened");
        }
        else {
            System.out.println("Window is opened");
            isOpen = true;
        }
    }

    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }

    public boolean isOpen() {
        return isOpen;
    }
}
