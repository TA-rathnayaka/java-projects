public class Car extends Vehicle{
    private int gears;
    private int seats;
    private int doors;


    public Car(int wheels, int speed, int gears, String color){
        super(wheels, speed, color);
        this.gears = gears;
        this.seats = seats;
    }

    @Override
    public void move(){
        System.out.println("Car.move() called");
        super.move();
    }

    @Override
    public void increaseDecreaseSpeed(boolean isIncreasing, int speed) {
        if (isIncreasing){
            System.out.println("Car is increasing in " + speed);
        } else {
            System.out.println("Car is decreasing in " + speed);
        }
    }
    public void changingGears() {
        System.out.println("Changing gear to " + gears);

    }
}
