public class SpeedConverter {
    public static long toMilesPerHour(double kilometersPerHour){
        if (kilometersPerHour < 0){
            return -1;
        }
        else {
            return Math.round(kilometersPerHour/1.609);
        }
    }
    public static void printConversion(long kilometersPerHour){
        if (kilometersPerHour < 0){
            System.out.println("Invalid Value");
        }
        else if (kilometersPerHour > 0){
            System.out.println(kilometersPerHour + " km/h = " + toMilesPerHour(kilometersPerHour) + "mi/h ");
        }
    }
}