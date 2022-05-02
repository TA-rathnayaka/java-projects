import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Enter Count \r" );
        int count = scanner.nextInt();
       int[] array = readIntegers(count);
        System.out.println("Minimum value you have entered " + findMin(array));
    }

    public static int[] readIntegers(int count) {
        int[] array = new int[count];
        System.out.println("Enter " + count + " numbers \r");
        for (int i=0; i < array.length; i++){
            array[i] = scanner.nextInt();
            scanner.nextLine();
        }
        return array;
    }
    public static int findMin(int[] array){
        int min = Integer.MAX_VALUE;
        for (int i=0; i<array.length; i++){
            if (array[i] < min){
                min = array[i];
            }
        }
      return min;
    }

}