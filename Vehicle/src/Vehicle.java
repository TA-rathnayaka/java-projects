public class Vehicle {
    private int wheels;
    private int speed;
    private int price;
    String color;
    public Vehicle(String color) {
        this(0, color);
    }
    public Vehicle(int speed, String color){
        this(0, speed, color);
    }
    public Vehicle(int wheels, int speed, String color){
        this.wheels = wheels;
        this.speed = speed;
        this.color = color;
    }
    public void increaseDecreaseSpeed(boolean isIncreasing,int speed){
        if (isIncreasing){
                System.out.println("Speed is increasing in " + speed);
        } else {
            System.out.println("Speed is decreasing in " + speed);
        }
    }
    public void move(){
        System.out.println("Vehicle.move() called");
    }
}
