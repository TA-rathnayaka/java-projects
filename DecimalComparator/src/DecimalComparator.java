public class DecimalComparator {
    public static boolean decimalComparator(double firstNumber, double secondNumber) {
        if (Math.round(firstNumber * 100) == Math.round(secondNumber * 100)) {
            return true;
        }
        return false;
    }
}
