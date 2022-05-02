public class TeenNumberChecker {
    public static boolean hasTeen(int firstNumber, int secondNumber, int thirdNumber) {
        if (isTeen(firstNumber) || isTeen(secondNumber) || isTeen(thirdNumber)) {
            return true;
        }
        return false;
    }

    public static boolean isTeen(int number) {
        if (number == 13 || number == 14 || number == 15 || number == 16 || number == 17 || number == 18 || number == 19) {
            return true;
        }
        return false;
    }
}
