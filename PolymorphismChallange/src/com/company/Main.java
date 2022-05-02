package com.company;
class Car {
    private String name;
    private boolean engine;
    private int cylinder;
    private int wheels;

    public Car(String name, int cylinder) {
        this.name = name;
        this.cylinder = cylinder;
        this.wheels = 4;
        this.engine = true;
    }
    public String startEngine() {
        return "Car -> startEngine()";
    }
    public String accelerate() {
        return "Car -> accelerate()";
    }
    public String brake(){
        return "Car -> brake()";
    }

    public String getName() {
        return name;
    }

    public boolean isEngine() {
        return engine;
    }

    public int getCylinder() {
        return cylinder;
    }

    public int getWheels() {
        return wheels;
    }
}
public class Main {

    public static void main(String[] args) {
        Car car = new Car("Unknown", 3);
        System.out.println(car.startEngine());
        System.out.println(car.accelerate());
        System.out.println(car.brake());

        Bense bense = new Bense("Bense", 3);
        System.out.println(bense.startEngine());
        System.out.println(bense.accelerate());
        System.out.println(bense.brake());

        Car BMW = new BMW("BMW", 5);
        System.out.println(BMW.startEngine());
        System.out.println(BMW.accelerate());
        System.out.println(BMW.brake());

        Car ferrari = new Ferrari("Ferrari", 3);
        System.out.println(ferrari.startEngine());
        System.out.println(ferrari.accelerate());
        System.out.println(ferrari.brake());

        Car tesla = new Ferrari("Tesla", 3);
        System.out.println(tesla.startEngine());
        System.out.println(tesla.accelerate());
        System.out.println(tesla.brake());
        }
}





class BMW extends Car{
    public BMW(String name, int cylinder) {
        super(name, cylinder);
    }

    public String startEngine(){
        return "BMW -> startEngine()";
    }
    public String accelerate() {
        return "BMW -> accelerate()";
    }
    public String brake(){
        return "BMW -> brake()";
    }

}
class Tesla extends Car{
    public Tesla(String name, int cylinder) {
        super(name, cylinder);
    }
    public String StartEngine(){
        return  getClass().getSimpleName() + " -> startEngine()";
    }
    public String accelerate() {
        return getClass().getSimpleName() + " -> accelerate()";
    }
    public String brake(){
        return getClass().getSimpleName() + " -> brake()";
    }

}
class Ferrari extends Car{
    public Ferrari(String name, int cylinder) {
        super(name, cylinder);
    }

    public String StartEngine(){
        return "Ferrari -> startEngine()";
    }
    public String accelerate() {
        return "Ferrari -> accelerate()";
    }
    public String brake(){
        return "Ferrari -> Brake()";
    }

}
class Bense extends Car{
    public Bense(String name, int cylinder) {
        super(name, cylinder);
    }
}
