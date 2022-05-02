import java.util.Arrays;
import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[] array = getIntegers(5);

        int[] sortArray = sortIntegers(array);
        printArray(array);
        printArray(sortArray);
    }

    public static int[] getIntegers(int number) {
        System.out.println("Enter " + number + " numbers on the console");
        int[] array = new int[number];
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
            scanner.nextLine();

        }
        return array;
    }

    public static int[] sortIntegers(int[] values) {
//        int max = Integer.MIN_VALUE;
//        int index = 0;
//        int[] array = new int[values.length];
//        for (int i=0; i<values.length; i++) {
//            array[i] = values[i];
//        }
//        int[] descendingArray = new int[array.length];
//        for (int i = 0; i < array.length; i++) {
//            for (int j = 0; j < array.length; j++) {
//                if (array[j] > max) {
//                    max = array[j];
//                    index = j;
//
//
//                }
//
//            }
//            descendingArray[i] = max;
//            max = Integer.MIN_VALUE;
//            array[index] = 0;
//        }
//        return descendingArray;
        int[] array = Arrays.copyOf(values, values.length);
        boolean flag = true;
        int temp;
        while (flag){
            flag = false;
            for (int i=0; i < array.length-1; i++){
                if (!(array[i] > array[i+1])){
                    temp = array[i];
                    array[i] = array[i+1];
                    array[i+1] = temp;
                    flag=true;
                }
            }
        }
        return array;
    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println("The element in index " + i + " is " + array[i]);
        }
    }
}
