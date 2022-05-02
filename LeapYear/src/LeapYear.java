public class LeapYear {
    public static boolean isLeapYear(int year) {
        boolean isLeap = false;
        if ((1 <= year) && (year <= 9999)){
            if (year % 4 == 0){
                if (year % 100 == 0){
                    if (year % 400 == 0){
                        isLeap = true;
                    }
                }
                else {
                    isLeap = true;
                }
            }
        }
        return isLeap;
//        if (((1 <= year) && (year <= 9999)) && (((year % 4 == 0) && (year % 100 != 0)) || ((year % 4 == 0) && (year % 100 == 0) && (year % 400 == 0)))) {
//            isLeap = true;
//        }
//        return isLeap;
    }
}
