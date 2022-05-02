public class IntEqualityPrinter {
    public static void printEqual(int firstNumber, int secondNumber, int thirdNumber) {
        if (firstNumber < 0 || secondNumber < 0 || thirdNumber < 0) {
            System.out.println("Invalid Value");
        } else if (firstNumber == secondNumber && firstNumber == thirdNumber && secondNumber == thirdNumber) {
            System.out.println("All Numbers are equal");
        } else if (firstNumber == secondNumber || firstNumber == thirdNumber || secondNumber == thirdNumber) {
            System.out.println("Neither all are equal or different");
        } else {
            System.out.println("All Numbers are different");
        }
    }
}

