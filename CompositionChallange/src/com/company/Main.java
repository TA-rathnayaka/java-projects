package com.company;

public class Main {

    public static void main(String[] args) {
	Lamp lamp = new Lamp(false, "white");
    Table table = new Table("square", new Dimension(200, 200, 200),"Brown");
    Window window = new Window(200,100,false);
    Bed bed = new Bed(new Dimension(100,200, 500), false, "Brown");
    Room room = new Room("White", new Dimension(1000, 2000, 2000), table,bed, window, lamp, 5);
    room.getFreshAir();
    room.closeAllWindows();
    room.paint("red");
    room.rearrangeRoom();
    room.getWindow().open();
    }
}
