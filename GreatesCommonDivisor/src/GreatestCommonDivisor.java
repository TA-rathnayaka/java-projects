public class GreatestCommonDivisor {
    public static int getGreatestCommonDivisor(int first, int second) {
        if (first > 10 && second > 10){
            int min;
            int divisor = 0;
            if (first < second){
                min = first;
            }else {
                min = second;
            }
           for (int i=min; i > 0; i--) {
               if (first % i == 0 && second % i == 0){
                   return i;
               }
           }
        }
        return -1;
    }
}
