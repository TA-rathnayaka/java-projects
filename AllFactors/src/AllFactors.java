public class AllFactors {
    public static void printFactors(int number){
        String factors = "";
        if (number > 0) {
            for (int i=number; i > 0; i--){
                if (number % i == 0){
                    factors += " " + i;
                }
            }
            System.out.println(factors);
        }else {
            System.out.println("Invalid Number");
        }
    }
}
