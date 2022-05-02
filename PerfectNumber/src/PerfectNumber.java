public class PerfectNumber {
    public static boolean isPerfectNumber(int number) {
        if (number >= 0) {
            int factors = 0;
            int sum = 0;
            for (int i = number-1 ; i > 0; i--) {
                if (number % i == 0) {
                    factors = i;
                    sum += factors;
                    if (number == sum) {
                        return true;
                    }
                }
            }

        }
        return false;
    }
}
