public class BMW extends Car{
    private int ac;
    private int turbo;

    public BMW(int wheels, int speed, int gears, String color, int ac, int turbo){
       super(wheels, speed, gears, color);
       this.ac = ac;
       this.turbo = turbo;
    }
    @Override
    public void move(){
        System.out.println("BMW.move() called");
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

    @Override
    public void changingGears() {
        System.out.println("BMW is changing gears");
        super.changingGears();
    }
}
