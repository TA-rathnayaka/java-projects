public class LastDigitChecker {
    public static boolean hasSameLastDigit(int firstNumber, int secondNumber, int thirdNumber){
        if (isValid(firstNumber) && isValid(secondNumber) && isValid(thirdNumber)){
           int firstLast = firstNumber % 10;
           int secondLast = secondNumber % 10;
           int thirdLast = thirdNumber % 10;
           if (firstLast == secondLast || firstLast == thirdLast || secondLast == thirdLast){
               return true;
           }

        }
        return false;
    }
    public static boolean isValid(int Number){
        if (10 <= Number && Number <= 1000){
            return true;
        }
        return false;
    }
}
