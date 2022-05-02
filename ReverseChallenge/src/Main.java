import java.util.Arrays;
import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        System.out.println("Entered array " + Arrays.toString(array));
        reverse(array);
        System.out.println("Reversed Array" + Arrays.toString(array));
    }
    private static void reverse(int[] array) {
        int temp;
        for (int i=0; i < array.length/2; i++) {
            temp = array[i];
            array[i] = array[array.length-i-1];
            array[array.length-i-1] = temp;
        }
    }
}
