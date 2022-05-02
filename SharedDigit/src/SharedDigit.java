public class SharedDigit {
    public static boolean hasSharedDigit(int firstNumber, int secondNumber) {
        if ((firstNumber >= 10 && firstNumber <= 99) && (secondNumber >= 10 && secondNumber <= 99)) {
            int lastDigitFirstNumber = 0;
            int lastDigitSecondNumber = 0;
            while (firstNumber > 0) {
                lastDigitFirstNumber = firstNumber % 10;
                firstNumber /= 10;
                while (secondNumber > 0) {
                    lastDigitSecondNumber = secondNumber % 10;
                    secondNumber /= 10;
                    if (lastDigitFirstNumber == lastDigitSecondNumber) {
                        return true;
                    }
                }

            }
        }
        return false;
    }
}
