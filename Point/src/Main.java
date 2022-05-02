public class Main {
    public static void main(String[] args) {
        Point first = new Point(6,5);
        Point second = new Point(3,1);
        System.out.println("Distance form (0,0) = " + first.distance());
        System.out.println("Distance form (0,0) = " + second.distance());
        System.out.println("Distance from second point " + first.distance(second));
        System.out.println("Distance form selected point " + first.distance(2,2));
    }
}
