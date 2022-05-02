import java.util.Scanner;

public class InputCalculator {
    public static void inputThenSumAndAverage(){
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int count = 0;
        while (true){
            System.out.println("Enter Number");
            boolean hasInt = scanner.hasNextInt();
            if (hasInt) {
                int number = scanner.nextInt();
                sum += number;
                count++;
            }else {
                System.out.println("SUM = " + sum + " AVG = " + Math.round((double) sum/count));
                break;
            }
            scanner.nextLine();
        }
        scanner.close();



    }
}
