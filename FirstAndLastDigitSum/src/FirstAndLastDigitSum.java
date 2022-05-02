public class FirstAndLastDigitSum {
    public static int sumFirstAndLastDigit(int number) {
        int sum = 0;
        int numberOfDigit = 0;
        int count = 0;
        int dummyNumber = number;
        int lastDigit = 0;
        if (number > 0) {
            while (dummyNumber > 0) {
                dummyNumber /= 10;
                numberOfDigit += 1;
            }
            while (number > 0) {
                count++;
                lastDigit = number % 10;
                number /= 10;
                if (count == 1 || count == numberOfDigit) {
                    sum += lastDigit;
                }

            }
            return sum;
        }
        return -1;
    }
}
