public class BarkingDog {
    public static boolean shouldWakeUp(boolean barking, int hourOfDay){
//        if (((0 <= hourOfDay && hourOfDay <= 23) &&barking) && (hourOfDay < 8 || hourOfDay > 22)){
//           return true;
//        }
//        return false;
        if ((hourOfDay <= 0) || (hourOfDay >= 23)){
            return false;
        }
        else if (barking && (hourOfDay < 8 || hourOfDay > 22)){
            return true;
        }
        return false;
      }

}
