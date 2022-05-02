public class Main {
    public static void main(String[] args) {
        WallArea area = new WallArea(5, 4);
        System.out.println("area = " + area.getArea());

        area.setHeight(-1.5);
        System.out.println("width = " + area.getWidth());
        System.out.println("height = " + area.getHeight());
        System.out.println("area = " + area.getArea());
    }
}
