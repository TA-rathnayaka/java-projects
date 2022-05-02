public class NumbersToWords {
    public static void numbersToWord(int number) {
        int numberOfDigits = getDigitCount(number);
        int count = 0;
        number = reverse(number);
        if (number >= 0) {
            String numberString = "";
            count++;
            while (number != 0) {
                int finalDigit = number % 10;
                number /= 10;


                switch (finalDigit) {
                    case 0:
                        numberString += " Zero";
                        break;
                    case 1:
                        numberString += " One";
                        break;
                    case 2:
                        numberString += " Two";
                        break;
                    case 3:
                        numberString += " Three";
                        break;
                    case 4:
                        numberString += " Four";
                        break;
                    case 5:
                        numberString += " Five";
                        break;
                    case 6:
                        numberString += " Six";
                        break;
                    case 7:
                        numberString += " Seven";
                        break;
                    case 8:
                        numberString += " Eight";
                        break;
                    case 9:
                        numberString += " Nine";
                        break;
                }
            }
            if (numberOfDigits > count){
                for (int i=1; i <= (numberOfDigits-count); i++){
                    numberString += " Zero";
                }
            }
            System.out.println(numberString);


        } else {
            System.out.println("Invalid Value");
        }

    }

    public static int reverse(int number) {
        String numberString = "";
        while (number != 0) {
            int finalDigit = number % 10;
            number /= 10;
            numberString += finalDigit;
        }
        return Integer.parseInt(numberString);
    }

    public static int getDigitCount(int number) {
        int count = 0;
        while (number > 0) {
            number /= 10;
            count++;
        }
       return count;
    }
}
