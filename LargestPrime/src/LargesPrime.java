public class LargesPrime {
    public static int getLargestPrime(int number) {
        if (number > 0) {
            int factor = 0;
            for (int i = number; i >= 2; i--) {
                if (number % i == 0) {
                    factor = i;
                    int count = 0;
                    for (int n = 2; n <= factor; n++){
                        if (factor % n == 0) {
                            count++;
                        }
                    }
                    if (count == 1){
                        return factor;

                    }
                }
            }
        }
        return -1;
    }
}
