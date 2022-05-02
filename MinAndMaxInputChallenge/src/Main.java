import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int maximumNumber = Integer.MIN_VALUE;
        int minimumNumber = Integer.MAX_VALUE;
        while (true) {
            System.out.println("Enter Number : " );
            boolean hasInt = scanner.hasNextInt();
            if (hasInt){
                int enteredNumber = scanner.nextInt();
                scanner.nextLine();
                if (enteredNumber > maximumNumber){
                    maximumNumber = enteredNumber;
                }
                if (enteredNumber < minimumNumber ){
                    minimumNumber = enteredNumber;
                }
            }else {
                System.out.println("Maximum number = " + maximumNumber);
                System.out.println("Minimum number = " + minimumNumber);
                break;
            }

        }
        scanner.close();
    }
}
